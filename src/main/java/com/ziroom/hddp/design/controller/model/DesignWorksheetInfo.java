package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Code;
import cn.mapway.document.annotation.Codes;
import cn.mapway.document.annotation.Doc;

import javax.validation.constraints.NotNull;
import java.util.List;

@Doc("设计工单信息")
public class DesignWorksheetInfo {

    @ApiField(value = "量房单代码", example = "LF200810893213")
    public String bizCode;

    @ApiField(value = "设计工单代码,订单编码规则[SJ+20200905(日期)+001(来源)+00001(5位序列值)]", example = "SJ2019038976")
    public String worksheetCode;

    @Codes({
            @Code(value = "0", desc = "未接单"),
            @Code(value = "1", desc = "设计中"),
            @Code(value = "2", desc = "设计完成")
    })
    @ApiField(value = "工单状态,只有所有的设计任务完成，并且审核之后，状态才会变更为设计完成", example = "0")
    public String status;

    @ApiField(value = "工单下的任务信息")
    public List<TaskInfo> tasks;

    @ApiField(value = "房源编码", example = "5604394343")
    @NotNull(message = "请填写房源编码")
    public String houseCode;

    @ApiField(value = "房源地址", example = "北京市将台路16号")
    @NotNull(message = "请填写房源地址")
    public String address;

    @ApiField(value = "使用此接口的人可以传入任何相关联到此设计工单的内容，设计系统不做解释，不适用，查询设计工单时，此值原样返回，也可以不填写", example = "15910868680")
    public String tag;

    @ApiField(value = "创建时间", example = "2020-05-13 13:53:07")
    public String createTime;


}
