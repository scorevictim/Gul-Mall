package com.gulmall.gulcoupon.controller;

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
import com.gulmall.gulcoupon.dto.SeckillSessionDTO;
import com.gulmall.gulcoupon.excel.SeckillSessionExcel;
import com.gulmall.gulcoupon.service.SeckillSessionService;
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
 * 秒杀活动场次
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@RestController
@RequestMapping("gulcoupon/seckillsession")
@Api(tags="秒杀活动场次")
public class SeckillSessionController {
    @Autowired
    private SeckillSessionService seckillSessionService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("gulcoupon:seckillsession:page")
    public Result<PageData<SeckillSessionDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<SeckillSessionDTO> page = seckillSessionService.page(params);

        return new Result<PageData<SeckillSessionDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("gulcoupon:seckillsession:info")
    public Result<SeckillSessionDTO> get(@PathVariable("id") Long id){
        SeckillSessionDTO data = seckillSessionService.get(id);

        return new Result<SeckillSessionDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("gulcoupon:seckillsession:save")
    public Result save(@RequestBody SeckillSessionDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        seckillSessionService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("gulcoupon:seckillsession:update")
    public Result update(@RequestBody SeckillSessionDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        seckillSessionService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("gulcoupon:seckillsession:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        seckillSessionService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("gulcoupon:seckillsession:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SeckillSessionDTO> list = seckillSessionService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, SeckillSessionExcel.class);
    }

}