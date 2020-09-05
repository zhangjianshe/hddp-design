package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

@Doc(value = "响应基础信息")
public class Resp {
    @ApiField(value = "操作返回代 成功-->0 其他 失败", example = "0")
    public String code;

    @ApiField(value = "返回的消息", example = "0")
    public String message;

    public Resp success() {
        code = "0";
        message = "操作成功";
        return this;
    }
}
