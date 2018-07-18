package com.szce.os.admin.controller.manage;

import com.szce.os.dao.model.OsUserregistrationinfo;
import com.szce.os.dao.model.OsUserregistrationinfoExample;
import com.szce.os.rpc.api.OsUserregistrationinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(value = "用户注册信息", description = "用户注册信息")
@RequestMapping("/manage/registerusermessage")
public class OsCompanyRegisterUserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OsConpanyBasicInfoController.class);

    @Autowired
    private OsUserregistrationinfoService osUserregistrationinfoService;

    @ApiOperation(value = "企业基本信息管理首页")
    @RequiresPermissions("os:registerusermessage:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/registerusermessage/index";
    }

    @ApiOperation(value = "企业基本信息列表")
    @RequiresPermissions("os:registerusermessage:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        OsUserregistrationinfoExample example = new OsUserregistrationinfoExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        if(!StringUtils.isBlank(search)){
            example.createCriteria().andUseraccountLike("%"+search+"%");
        }
        List<OsUserregistrationinfo> rows = this.osUserregistrationinfoService.selectByExampleForOffsetPage(example,offset,limit);
        long total = this.osUserregistrationinfoService.countByExample(example);
        Map<String, Object> result = new HashMap<>(2);
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

}
