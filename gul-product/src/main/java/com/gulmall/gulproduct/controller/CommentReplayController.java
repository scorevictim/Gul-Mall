package com.gulmall.gulproduct.controller;

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
import com.gulmall.gulproduct.dto.CommentReplayDTO;
import com.gulmall.gulproduct.excel.CommentReplayExcel;
import com.gulmall.gulproduct.service.CommentReplayService;
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
 * 商品评价回复关系
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@RestController
@RequestMapping("gulproduct/commentreplay")
@Api(tags="商品评价回复关系")
public class CommentReplayController {
    @Autowired
    private CommentReplayService commentReplayService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("gulproduct:commentreplay:page")
    public Result<PageData<CommentReplayDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<CommentReplayDTO> page = commentReplayService.page(params);

        return new Result<PageData<CommentReplayDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("gulproduct:commentreplay:info")
    public Result<CommentReplayDTO> get(@PathVariable("id") Long id){
        CommentReplayDTO data = commentReplayService.get(id);

        return new Result<CommentReplayDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("gulproduct:commentreplay:save")
    public Result save(@RequestBody CommentReplayDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        commentReplayService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("gulproduct:commentreplay:update")
    public Result update(@RequestBody CommentReplayDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        commentReplayService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("gulproduct:commentreplay:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        commentReplayService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("gulproduct:commentreplay:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<CommentReplayDTO> list = commentReplayService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, CommentReplayExcel.class);
    }

}