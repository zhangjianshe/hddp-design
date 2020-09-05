package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

@Doc(value = "创建设计工单响应信息")
public class CreateDesignWorksheetResp extends Resp {

    @ApiField(value="设计工单代码,订单编码规则[SJ+20200905(日期)+001(来源)+00001(5位序列值)]",example="SJ2019038976")
    public String worksheetCode;

}
