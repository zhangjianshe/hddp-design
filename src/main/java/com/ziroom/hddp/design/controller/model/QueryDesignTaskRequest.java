package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

import javax.validation.constraints.NotNull;

@Doc(value = "查询任务单信息请求")
public class QueryDesignTaskRequest {
    @ApiField(value = "任务单号,任务单号编码规则[RW+20200905(日期)+00001(5位序列值)]", example = "RW2019038976")
    @NotNull(message = "必填任务单号")
    public String taskCode;
}
