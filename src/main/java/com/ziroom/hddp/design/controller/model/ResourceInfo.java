package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Code;
import cn.mapway.document.annotation.Codes;
import cn.mapway.document.annotation.Doc;

@Doc(value = "工单的任务信息,每个任务下可以有多个图纸信息,本记录表示一个图纸信息")
public class ResourceInfo {

    @ApiField(value = "图片的访问代码,目前只在内部使用,外部不用关心", example = "a1319cb4-7b87-4de2-9617-1e487bf66fb5")
    public String accessCode;

    @ApiField(value = "设计图纸的URL,为一个绝对路径表示的资源", example = "http://image.ziroom.com/g2/M00/0D/02/ChAFEVg79a6AKSSHABioEmlaueo840.jpg")
    public String url;

    @ApiField(value = "文件类型[pdf,png,jpg]", example = "pdf")
    public String fileType;

    @Codes({
            @Code(value = "108", desc = "房屋平面图"),
            @Code(value = "109", desc = "水电点位图"),
            @Code(value = "110", desc = "3d设计方案云设计图片图"),

    })
    @ApiField(value = "设计图纸类型", example = "109")
    public String designType;

    @ApiField(value = "3D 设计时使用 图纸用途 0 未设定 1 封面图 2设计方案", example = "0")
    public String usage;

    @ApiField(value = "3D 设计时使用，图片标签,本次不用", example = "1010")
    public String tag;

    @ApiField(value = "3D 设计时使用，房间ID,本次不用", example = "62182483")
    public Long roomId;
    @ApiField(value = "3D 设计时使用，房间名称,本次不用", example = "东卧_01")
    public String roomName;
    @ApiField(value = "3D 设计时使用，房间类型编码,本次不用", example = "308600000001")
    public String roomTypeCode;

    @ApiField(value = "创建时间", example = "2020-05-13 13:53:07")
    public String createTime;



}
