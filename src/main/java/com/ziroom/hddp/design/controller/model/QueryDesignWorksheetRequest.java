package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

import javax.validation.constraints.NotNull;

@Doc("查询设计单参数")
public class QueryDesignWorksheetRequest {
    @ApiField(value = "量房单代码", example = "LF200810893213")
    @NotNull(message = "量房单必填")
    public String bizCode;
}
