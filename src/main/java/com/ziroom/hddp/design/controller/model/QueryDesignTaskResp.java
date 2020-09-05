package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

@Doc("任务单信息")
public class QueryDesignTaskResp extends Resp {

    @ApiField("任务单信息")
    public TaskInfo data;
}
