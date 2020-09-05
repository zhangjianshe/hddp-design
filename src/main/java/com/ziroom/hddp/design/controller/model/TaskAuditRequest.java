package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

@Doc(value = "任务审批记录请求", desc = "审批记录会存在审批记录表中")
public class TaskAuditRequest {
    @ApiField(value = "任务代码", example = "RW20100990099899")
    public String taskCode;

    @ApiField(value = "当前登录用户", example = "60005677")
    public String userCode;

    @ApiField(value = "审核结果 0->通过 1->不通过,不通过后任务状态变更为已驳回 ，需要重新提交", example = "1")
    public String auditResult;

    @ApiField(value = "提交的审核信息", example = "拍照图纸不清晰")
    public String comment;

}
