package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

@Doc("设计工单的信息")
public class QueryDesignWorksheetResp extends Resp {

    @ApiField(value = "设计工单信息")
    public DesignWorksheetInfo data;
}
