package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Code;
import cn.mapway.document.annotation.Codes;
import cn.mapway.document.annotation.Doc;

import javax.validation.constraints.NotNull;

@Doc(value = "查询任务单列表", desc = "根据当前登录用户，查询该登录用户下属 设计总监>设计经理>设计师，下的所有设计任务单,查询时会根据字段的内容 进行 AND 查询")
public class QueryDesignWorksheetListRequest {
    @ApiField(value = "用户登录代码", example = "60005677")
    @NotNull(message = "没有当前登录用户信息")
    public String userCode;

    @ApiField(value = "设计单号", example = "SJ201099032913")
    public String worksheetCode;

    @Codes({
            @Code(value = "108", desc = "房屋平面图"),
            @Code(value = "109", desc = "水电点位图"),
            @Code(value = "110", desc = "3d设计方案云设计图片图"),
    })
    @ApiField(value = "设计类型,目前支持三种设计类型", example = "109")
    public String designType;

    @Codes({
            @Code(value = "0", desc = "未提交"),
            @Code(value = "1", desc = "审核中"),
            @Code(value = "2", desc = "已驳回"),
            @Code(value = "3", desc = "审核完成")
    })
    @ApiField(value = "任务状态", example = "0")
    public String status;

    @ApiField(value = "查询起始时间，精确到时分秒,如果不填，搜索全部", example = "2020-05-13 13:53:07")
    public String startTime;

    @ApiField(value = "查询结束时间，精确到时分秒，如果不填（null 或者 空字符串），搜索全部", example = "2020-05-13 13:53:07")
    public String startEnd;

    @ApiField(value = "分页大小，每次返回的数量", example = "20")
    public Integer pageSize = 20;

    @ApiField(value = "当前页,从1开始计数", example = "1")
    public Integer page = 1;
}
