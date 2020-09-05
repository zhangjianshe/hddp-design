package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

@Doc("提交任务资源返回")
public class TaskResourceSubmitResp extends Resp {
    @ApiField(value = "设计图纸的URL,为一个绝对路径表示的资源", example = "http://image.ziroom.com/g2/M00/0D/02/ChAFEVg79a6AKSSHABioEmlaueo840.jpg")
    public String url;
}
