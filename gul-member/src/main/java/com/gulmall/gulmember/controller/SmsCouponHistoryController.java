package com.gulmall.gulmember.controller;

import com.gulmall.common.annotation.LogOperation;
import com.gulmall.common.constant.Constant;
import com.gulmall.common.page.PageData;
import com.gulmall.common.utils.ExcelUtils;
import com.gulmall.common.utils.Result;
import com.gulmall.common.validator.AssertUtils;
import com.gulmall.common.validator.ValidatorUtils;
import com.gulmall.common.validator.group.AddGroup;
import com.gulmall.common.validator.group.DefaultGroup;
import com.gulmall.common.validator.group.UpdateGroup;
import com.gulmall.gulmember.dto.SmsCouponHistoryDTO;
import com.gulmall.gulmember.excel.SmsCouponHistoryExcel;
import com.gulmall.gulmember.service.SmsCouponHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 优惠券领取历史记录
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@RestController
@RequestMapping("gulmember/smscouponhistory")
@Api(tags="优惠券领取历史记录")
public class SmsCouponHistoryController {
    @Autowired
    private SmsCouponHistoryService smsCouponHistoryService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("gulmember:smscouponhistory:page")
    public Result<PageData<SmsCouponHistoryDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<SmsCouponHistoryDTO> page = smsCouponHistoryService.page(params);

        return new Result<PageData<SmsCouponHistoryDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("gulmember:smscouponhistory:info")
    public Result<SmsCouponHistoryDTO> get(@PathVariable("id") Long id){
        SmsCouponHistoryDTO data = smsCouponHistoryService.get(id);

        return new Result<SmsCouponHistoryDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("gulmember:smscouponhistory:save")
    public Result save(@RequestBody SmsCouponHistoryDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        smsCouponHistoryService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("gulmember:smscouponhistory:update")
    public Result update(@RequestBody SmsCouponHistoryDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        smsCouponHistoryService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("gulmember:smscouponhistory:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        smsCouponHistoryService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("gulmember:smscouponhistory:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SmsCouponHistoryDTO> list = smsCouponHistoryService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, SmsCouponHistoryExcel.class);
    }

}