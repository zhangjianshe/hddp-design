package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

import java.util.ArrayList;
import java.util.List;

@Doc(value = "查询任务单列表", desc = "根据当前登录用户，查询该登录用户下属 设计总监>设计经理>设计师，下的所有设计任务单")
public class QueryDesignWorksheetListResp extends Resp {

    @ApiField(value = "总共的数量", example = "1352")
    public Long total;

    @ApiField(value = "分页大小，每次返回的数量", example = "20")
    public int pageSize;

    @ApiField(value = "当前页,从1开始计数", example = "1")
    public int page;

    @ApiField(value = "根据查询条件查询到任务信息")
    public List<TaskInfo> tasks;



    public QueryDesignWorksheetListResp() {
        tasks = new ArrayList<>();
    }


}
