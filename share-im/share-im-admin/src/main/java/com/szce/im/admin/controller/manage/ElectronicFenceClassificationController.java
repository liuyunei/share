package com.szce.im.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.szce.common.base.BaseController;
import com.szce.common.validator.LengthValidator;
import com.szce.im.common.constant.CmsResult;
import com.szce.im.common.constant.CmsResultConstant;
import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.dao.model.ImElectronicfenceclassificationExample;
import com.szce.im.dao.model.ImElectronicfencedata;
import com.szce.im.rpc.api.ImElectronicfenceclassificationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
 * 电子围栏分类管理控制器
 * @Auther: spy
 * @Date: 2018/7/17 11:49
 * @Description:
 */
@Controller
@Api(value = "围栏分类管理", description = "围栏分类管理")
@RequestMapping(value = "/manage/electronicFence/classification")
public class ElectronicFenceClassificationController extends BaseController{

    @Autowired
    private ImElectronicfenceclassificationService imElectronicfenceclassificationService;


    @ApiOperation(value = "电子围栏管理首页")
    @RequiresPermissions("im:classification:read")
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "manage/electronicFence/classification/index";
    }

    @ApiOperation(value = "分类列表")
    @RequiresPermissions("im:classification:read")
    @RequestMapping(value = "/fenceClassifications", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        ImElectronicfenceclassificationExample example = new ImElectronicfenceclassificationExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        example.setOrderByClause("createtime  desc");
        List<ImElectronicfenceclassification> rows = this.imElectronicfenceclassificationService.selectByExampleForOffsetPage(example, offset, limit);
        long total = this.imElectronicfenceclassificationService.countByExample(example);
        Map<String, Object> result = new HashMap<>(2);
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @ApiOperation(value = "新增类别，打开弹窗")
    @RequiresPermissions("im:classification:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "manage/electronicFence/classification/create";
    }

    @ApiOperation(value = "新增类别")
    @RequiresPermissions("im:classification:create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(ImElectronicfenceclassification classification) {
        ComplexResult result = FluentValidator.checkAll()
                .on(classification.getElectronicfenceclassificationname(), new LengthValidator(1, 100, "类别名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new CmsResult(CmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        classification.setElectronicfenceclassificationid(System.currentTimeMillis()+"");
        classification.setCreatetime(new Date());
        int count = this.imElectronicfenceclassificationService.insertSelective(classification);
        if (count > 0){
            return new CmsResult(CmsResultConstant.SUCCESS, count);
        }
        return new CmsResult(CmsResultConstant.FAILED, count);
    }

    @ApiOperation(value = "删除类别")
    @RequiresPermissions("im:classification:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = this.imElectronicfenceclassificationService.deleteByIds(ids);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "修改类别，打开弹窗")
    @RequiresPermissions("im:classification:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") String id, ModelMap modelMap) {

        ImElectronicfenceclassification imElectronicfenceclassification = imElectronicfenceclassificationService.getById(id);
        modelMap.put("imElectronicfenceclassification", imElectronicfenceclassification);
        return "manage/electronicFence/classification/update";
    }

    @ApiOperation(value = "修改类别")
    @RequiresPermissions("im:classification:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Object update(@PathVariable("id") String id, ImElectronicfenceclassification classification) {
        ComplexResult result = FluentValidator.checkAll()
                .on(classification.getElectronicfenceclassificationname(), new LengthValidator(1, 100, "类别名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new CmsResult(CmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        classification.setElectronicfenceclassificationid(id);
        int count = this.imElectronicfenceclassificationService.updateByIdSelective(classification);
        if (count > 0)
            return new CmsResult(CmsResultConstant.SUCCESS, count);
        return new CmsResult(CmsResultConstant.FAILED, count);
    }
}
