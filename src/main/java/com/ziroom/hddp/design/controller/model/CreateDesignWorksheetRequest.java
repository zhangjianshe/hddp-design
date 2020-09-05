package com.ziroom.hddp.design.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Code;
import cn.mapway.document.annotation.Codes;
import cn.mapway.document.annotation.Doc;

import javax.validation.constraints.NotNull;
import java.util.List;

@Doc("创建设计工单")
public class CreateDesignWorksheetRequest {
    @ApiField(value = "量房单代码", example = "LF200810893213")
    @NotNull(message = "量房单必填")
    public String bizCode;

    @ApiField(value = "设计师用户号", example = "60005677")
    @NotNull(message = "请填写设计师用户号")
    public String zdUserCode;


    @ApiField(value = "房源编码", example = "5604394343")
    @NotNull(message = "请填写房源编码")
    public String houseCode;

    @ApiField(value = "房源地址", example = "北京市将台路16号")
    @NotNull(message = "请填写房源地址")
    public String address;

    @Codes({
            @Code(value = "108", desc = "房屋平面图"),
            @Code(value = "109", desc = "水电点位图"),
            @Code(value = "110", desc = "3d设计方案云设计图片图"),

    })
    @ApiField(value = "设计类型,目前支持三种设计类型", example = "")
    @NotNull(message = "请填写设计类型")
    public List<String> designTypes;

    @ApiField(value = "工单来源，此处可以填写公司的产品版本，设计系统对此不会解释使用，PRD上说 填写 心舍", example = "心舍")
    @NotNull(message = "请填写创建工单来源")
    public String source;

    @ApiField(value = "使用此接口的人可以传入任何相关联到此设计工单的内容，设计系统不做解释，不使用，查询设计工单时，此值原样返回，也可以不填写", example = "15910868680", mandidate = false)
    public String tag;
}
