package com.szce.vtm.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.szce.common.base.BaseController;
import com.szce.common.util.StringUtil;
import com.szce.common.validator.LengthValidator;
import com.szce.vtm.common.constant.VtmResult;
import com.szce.vtm.common.constant.VtmResultConstant;
import com.szce.vtm.dao.model.VtmBikebasicinfo;
import com.szce.vtm.dao.model.VtmBikebasicinfoExample;
import com.szce.vtm.rpc.api.VtmBikebasicinfoService;
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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: 刘兴
 * Date: Created in 2018/7/17
 */
@Controller
@Api(value = "车辆信息管理", description = "车辆信息管理")
@RequestMapping("/manage/bikebasicinfo")
public class VtmbikebasicinfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VtmbikebasicinfoController.class);

    @Autowired
    private VtmBikebasicinfoService vtmBikebasicinfoService;

    @ApiOperation(value = "车辆投放管理系统首页")
    @RequiresPermissions("vtm:bikebasicinfo:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/bikebasicinfo/index.jsp";
    }

    @ApiOperation(value = "车辆信息列表")
    @RequiresPermissions("vtm:bikebasicinfo:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        VtmBikebasicinfoExample vtmBikebasicinfoExample = new VtmBikebasicinfoExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            vtmBikebasicinfoExample.setOrderByClause(StringUtil.humpToLine(sort) + " " + order);
        }
        List<VtmBikebasicinfo> rows=vtmBikebasicinfoService.selectByExampleForOffsetPage(vtmBikebasicinfoExample,offset, limit);
        long total = vtmBikebasicinfoService.countByExample(vtmBikebasicinfoExample);
        Map<String, Object> result = new HashMap<String, Object>(2);
        System.out.println("输出总数信息："+total);
        System.out.println("输出车辆列表信息："+rows);
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增车辆信息")
    @RequiresPermissions("vtm:bikebasicinfo:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "/manage/bikebasicinfo/create.jsp";
    }

    @ApiOperation(value = "新增车辆信息")
    @RequiresPermissions("vtm:bikebasicinfo:create")
    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Object create(VtmBikebasicinfo vtmBikebasicinfo) {
        ComplexResult result = FluentValidator.checkAll()
                .on(vtmBikebasicinfo.getBikeid(), new LengthValidator(1, 20, "车辆编号"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new VtmResult(VtmResultConstant.INVALID_LENGTH, result.getErrors());
        }
        Date date=new Date();
        date.toLocaleString();
        vtmBikebasicinfo.setDeliverytime(date);
        System.out.println("将要插入数据库的信息vtmBikebasicinfo："+vtmBikebasicinfo);
        int count = vtmBikebasicinfoService.insertSelective(vtmBikebasicinfo);
        return new VtmResult(VtmResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "删除车辆信息")
    @RequiresPermissions("vtm:bikebasicinfo:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = vtmBikebasicinfoService.deleteBikebasicinfo(ids);
        return new VtmResult(VtmResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "修改车辆信息")
    @RequiresPermissions("vtm:bikebasicinfo:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") String id, ModelMap modelMap) {
        VtmBikebasicinfo vtmBikebasicinfo = vtmBikebasicinfoService.getBikebasicinfo(id);
        modelMap.put("bikebasicinfo", vtmBikebasicinfo);
        return "/manage/bikebasicinfo/update.jsp";
    }

    @ApiOperation(value = "修改车辆信息")
    @RequiresPermissions("vtm:bikebasicinfo:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") String id, VtmBikebasicinfo vtmBikebasicinfo) {
        ComplexResult result = FluentValidator.checkAll()
                .on(vtmBikebasicinfo.getBikeid(), new LengthValidator(1, 20, "名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new VtmResult(VtmResultConstant.INVALID_LENGTH, result.getErrors());
        }
        vtmBikebasicinfo.setBikeid(id);
        Date date=new Date();
        date.toLocaleString();
        vtmBikebasicinfo.setDeliverytime(date);
        System.out.println("将要修改的信息是："+vtmBikebasicinfo);
        int count = vtmBikebasicinfoService.updateByPrimaryKeySelective(vtmBikebasicinfo);
        return new VtmResult(VtmResultConstant.SUCCESS, count);
    }
}
