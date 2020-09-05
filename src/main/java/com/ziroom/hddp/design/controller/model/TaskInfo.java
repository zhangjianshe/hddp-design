package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Code;
import cn.mapway.document.annotation.Codes;
import cn.mapway.document.annotation.Doc;

import javax.validation.constraints.NotNull;
import java.util.List;

@Doc("工单下的任务信息")
public class TaskInfo {

    @ApiField(value = "任务单来源，此处可以填写公司的产品版本，设计系统对此不会解释使用，PRD上说 填写 心舍", example = "心舍")
    @NotNull(message = "请填写创建工单来源")
    public String source;

    @ApiField(value = "设计工单代码,工单编码规则[SJ+20200905(日期)+001(来源)+00001(5位序列值)]", example = "SJ2019038976")
    public String worksheetCode;

    @ApiField(value = "任务单号,任务单号编码规则[RW+20200905(日期)+00001(5位序列值)]", example = "RW2019038976")
    public String taskCode;

    @ApiField(value = "物业地址", example = "北京市朝阳区将台路16号")
    public String address;

    @ApiField(value = "设计师姓名", example = "张建设")
    public String zdUserName;

    @ApiField(value = "设计师工号", example = "60005677")
    public String zdUserCode;

    @ApiField(value = "创建时间", example = "2020年05月13日 13:53:07")
    public String createTime;

    @Codes({
            @Code(value = "108", desc = "房屋平面图"),
            @Code(value = "109", desc = "水电点位图"),
            @Code(value = "110", desc = "3d设计方案云设计图片图"),

    })
    @ApiField(value = "设计类型,目前支持三种设计类型", example = "109")
    @NotNull(message = "请填写设计类型")
    public String designType;

    @Codes({
            @Code(value = "0", desc = "未提交"),
            @Code(value = "1", desc = "审核中"),
            @Code(value = "2", desc = "已驳回"),
            @Code(value = "3", desc = "审核完成")
    })
    @ApiField(value = "任务状态", example = "0")
    public String status;

    @ApiField(value = "审批时间", example = "2020年05月13日 13:53:07")
    public String approvalTime;

    @ApiField(value = "审批人", example = "张建设")
    public String approvalUserName;

    @ApiField(value = "审批人代码", example = "60005677")
    public String approvalUserCode;

    @ApiField(value = "任务下的图纸信息，查询列表时这个字段不会返回内容，会返回一个空数组")
    public List<ResourceInfo> resources;

    @ApiField(value = "当前登录用户对任务单的操作权限信息，有三种(VIEW,SUBMIT,AUDIT)")
    public List<String> authorization;

}
