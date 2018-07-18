package com.szce.im.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.szce.common.base.BaseController;
import com.szce.common.validator.LengthValidator;
import com.szce.common.validator.SizeValidator;
import com.szce.im.common.constant.CmsResult;
import com.szce.im.common.constant.CmsResultConstant;
import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.dao.model.ImElectronicfencedata;
import com.szce.im.dao.model.ImElectronicfencedataExample;
import com.szce.im.dao.model.custom.ImElectronicfencedataCustom;
import com.szce.im.rpc.api.ImElectronicfenceclassificationService;
import com.szce.im.rpc.api.ImElectronicfencedataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.Null;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电子围栏基础信息控制器
 * @Auther: spy
 * @Date: 2018/7/17 11:49
 * @Description:
 */
@Controller
@Api(value = "围栏基础信息", description = "围栏基础信息")
@RequestMapping(value = "/manage/electronicFence/basicInfo")
public class ElectronicFenceDataController extends BaseController{

    @Autowired
    private ImElectronicfencedataService imElectronicfencedataService;

    @Autowired
    private ImElectronicfenceclassificationService imElectronicfenceclassificationService;

    @ApiOperation(value = "电子围栏基础信息首页")
    @RequiresPermissions("im:basicinfo:read")
    @RequestMapping(method = RequestMethod.GET)
    public String index( ) {
        return "manage/electronicFence/basicInfo/index";
    }

    @ApiOperation(value = "电子围栏列表")
    @RequiresPermissions("im:basicinfo:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        // 查询条件
        System.out.println(search);
        Map<String, Object> cond = new HashMap<>();
        cond.put("offset", offset);
        cond.put("limit", limit);
        cond.put("sort", sort);
        cond.put("order", order);
        List<ImElectronicfencedataCustom> rows = this.imElectronicfencedataService.getPage(cond, search);
        long total = this.imElectronicfencedataService.getCount(search);
        Map<String, Object> result = new HashMap<>(2);
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增电子围栏，打开弹窗")
    @RequiresPermissions("im:basicinfo:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(HttpServletRequest request) {
        List<ImElectronicfenceclassification> classifications = this.imElectronicfenceclassificationService.getAll();
        request.setAttribute("classifications", classifications);
        return "manage/electronicFence/basicInfo/create";
    }

    @ApiOperation(value = "新增电子围栏")
    @RequiresPermissions("im:basicinfo:create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(ImElectronicfencedata imElectronicfencedata) {
        ComplexResult result = FluentValidator.checkAll()
                .on(imElectronicfencedata.getElectronicfenceid(), new LengthValidator(1,30, "围栏编号"))
                .on(imElectronicfencedata.getElectronicfencename(), new LengthValidator(1, 100, "围栏名称"))
                .on(imElectronicfencedata.getArea(), new SizeValidator(1, 100000, "面积"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new CmsResult(CmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        imElectronicfencedata.setCreatetime(new Date());
        int count = this.imElectronicfencedataService.insert(imElectronicfencedata);
        if (count > 0){
            return new CmsResult(CmsResultConstant.SUCCESS, count);
        }
        return new CmsResult(CmsResultConstant.FAILED, count);
    }

    @ApiOperation(value = "删除电子围栏")
    @RequiresPermissions("im:basicinfo:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = this.imElectronicfencedataService.deleteByIds(ids);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "修改电子围栏，打开弹窗")
    @RequiresPermissions("im:basicinfo:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") String id, ModelMap modelMap, HttpServletRequest request) {
        List<ImElectronicfenceclassification> classifications = this.imElectronicfenceclassificationService.getAll();
        request.setAttribute("classifications", classifications);
        ImElectronicfencedata imElectronicfencedata = imElectronicfencedataService.getById(id);
        System.out.println(imElectronicfencedata.toString());
        modelMap.put("imElectronicfencedata", imElectronicfencedata);
        return "manage/electronicFence/basicInfo/update";
    }

    @ApiOperation(value = "修改电子围栏")
    @RequiresPermissions("im:basicinfo:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") String id, ImElectronicfencedata imElectronicfencedata) {
        ComplexResult result = FluentValidator.checkAll()
                .on(imElectronicfencedata.getElectronicfencename(), new LengthValidator(1, 100, "围栏名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new CmsResult(CmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        int count = this.imElectronicfencedataService.updateByIdSelective(imElectronicfencedata);
        if (count > 0)
            return new CmsResult(CmsResultConstant.SUCCESS, count);
        return new CmsResult(CmsResultConstant.FAILED, count);
    }
}
