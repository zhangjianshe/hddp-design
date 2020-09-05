package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Code;
import cn.mapway.document.annotation.Codes;
import cn.mapway.document.annotation.Doc;

@Doc(value = "提交设计资源请求")
public class TaskResourceSubmitReq {
    @Codes({
            @Code(value = "108", desc = "房屋平面图"),
            @Code(value = "109", desc = "水电点位图"),
            @Code(value = "110", desc = "3d设计方案云设计图片图"),

    })
    @ApiField(value = "图纸类型", example = "108")
    public String designType;

    @ApiField(value = "图纸数据,在WEB页面提交时，会写此资源")
    public String resource;

    @ApiField(value = "任务代码", example = "RW20100990099899")
    public String taskCode;
}
