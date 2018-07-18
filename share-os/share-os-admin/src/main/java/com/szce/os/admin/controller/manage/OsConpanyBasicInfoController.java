package com.szce.os.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.szce.cms.common.constant.CmsResult;
import com.szce.cms.common.constant.CmsResultConstant;
import com.szce.common.base.BaseController;
import com.szce.common.validator.LengthValidator;
import com.szce.os.dao.model.OsCompanybasicinfo;
import com.szce.os.dao.model.OsCompanybasicinfoExample;
import com.szce.os.rpc.api.OsCompanybasicinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 企业运营
 */
@Controller
@Api(value = "企业运营监管系统", description = "企业运营监管系统")
@RequestMapping("/manage/companybasicinfo")
public class OsConpanyBasicInfoController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OsConpanyBasicInfoController.class);

    @Autowired
    private OsCompanybasicinfoService osCompanybasicinfoService;


    @ApiOperation(value = "企业基本信息管理首页")
    @RequiresPermissions("os:companybasicinfo:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/companybasicinfo/index";
    }

    @ApiOperation(value = "企业基本信息列表")
    @RequiresPermissions("os:companybasicinfo:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        OsCompanybasicinfoExample example = new OsCompanybasicinfoExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        if(!StringUtils.isBlank(search)){
            example.createCriteria().andCompaynameLike("%"+search+"%");
        }
        List<OsCompanybasicinfo> rows = this.osCompanybasicinfoService.selectByExampleForOffsetPage(example,offset,limit);
        long total = this.osCompanybasicinfoService.countByExample(example);
        Map<String, Object> result = new HashMap<>(2);
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "删除专题")
    @RequiresPermissions("os:companybasicinfo:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids){
        int count = osCompanybasicinfoService.deleteByPrimaryKeysTypeString(ids);
        if(count >= 0){
            return new CmsResult(CmsResultConstant.SUCCESS, count);
        }else{
            return new CmsResult(CmsResultConstant.FAILED,count);
        }
    }

    @ApiOperation(value = "修改专题")
    @RequiresPermissions("os:companybasicinfo:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") String id, ModelMap modelMap) {
        OsCompanybasicinfo osCompanybasicinfo = osCompanybasicinfoService.getOsCompanyBasicInfoByCompanyId(id);
        modelMap.put("companybasicinfo", osCompanybasicinfo);
        return "/manage/companybasicinfo/update";
    }

    @ApiOperation(value = "修改专题")
    @RequiresPermissions("os:companybasicinfo:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") String id, OsCompanybasicinfo osCompanybasicinfo) {
        ComplexResult result = FluentValidator.checkAll()
                .on(osCompanybasicinfo.getCompayname(), new LengthValidator(1, 100, "企业名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new CmsResult(CmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        osCompanybasicinfo.setCompanyid(id);
        int count = osCompanybasicinfoService.updateByPrimaryKeySelective(osCompanybasicinfo);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }


    @ApiOperation(value = "新增专题")
    @RequiresPermissions("os:companybasicinfo:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "/manage/companybasicinfo/create";
    }

    @ApiOperation(value = "新增专题")
    @RequiresPermissions("os:companybasicinfo:create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(OsCompanybasicinfo osCompanybasicinfo) {
        ComplexResult result = FluentValidator.checkAll()
                .on(osCompanybasicinfo.getCompayname(), new LengthValidator(1, 100, "企业名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new CmsResult(CmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        Date date = new Date(System.currentTimeMillis());
        osCompanybasicinfo.setRegistrationtime(date);
        int currentCount = osCompanybasicinfoService.countByExample(new OsCompanybasicinfoExample());
        osCompanybasicinfo.setCompanyid(String.valueOf(currentCount+100));
        int count = osCompanybasicinfoService.insertSelective(osCompanybasicinfo);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }


}
