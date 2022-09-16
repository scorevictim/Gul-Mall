package com.gulmall.member.controller;

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
import com.gulmall.member.dto.SmsCouponSpuRelationDTO;
import com.gulmall.member.excel.SmsCouponSpuRelationExcel;
import com.gulmall.member.service.SmsCouponSpuRelationService;
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
 * 优惠券与产品关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@RestController
@RequestMapping("member/smscouponspurelation")
@Api(tags="优惠券与产品关联")
public class SmsCouponSpuRelationController {
    @Autowired
    private SmsCouponSpuRelationService smsCouponSpuRelationService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("member:smscouponspurelation:page")
    public Result<PageData<SmsCouponSpuRelationDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<SmsCouponSpuRelationDTO> page = smsCouponSpuRelationService.page(params);

        return new Result<PageData<SmsCouponSpuRelationDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("member:smscouponspurelation:info")
    public Result<SmsCouponSpuRelationDTO> get(@PathVariable("id") Long id){
        SmsCouponSpuRelationDTO data = smsCouponSpuRelationService.get(id);

        return new Result<SmsCouponSpuRelationDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("member:smscouponspurelation:save")
    public Result save(@RequestBody SmsCouponSpuRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        smsCouponSpuRelationService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("member:smscouponspurelation:update")
    public Result update(@RequestBody SmsCouponSpuRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        smsCouponSpuRelationService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("member:smscouponspurelation:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        smsCouponSpuRelationService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("member:smscouponspurelation:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SmsCouponSpuRelationDTO> list = smsCouponSpuRelationService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, SmsCouponSpuRelationExcel.class);
    }

}