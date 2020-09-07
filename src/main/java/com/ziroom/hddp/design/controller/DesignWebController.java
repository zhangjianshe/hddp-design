package com.ziroom.hddp.design.controller;

import cn.mapway.document.annotation.Doc;
import com.ziroom.hddp.design.controller.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Doc(value = "家装设计-页面控制", group = "家装设计")
@RequestMapping(value = "/api/v2/design")
public class DesignWebController {

    /**
     * 接口负责人
     */
    private static final String AUTHOR_ZHANGJIANSHE = "张建设";

    @Doc(value = "创建设计工单", group = "/1.工单", author = AUTHOR_ZHANGJIANSHE, order = 1)
    @RequestMapping(value = "worksheet/create")
    public CreateDesignWorksheetResp createDesignWorksheet(@RequestBody CreateDesignWorksheetRequest request) {
        return new CreateDesignWorksheetResp();
    }

    @Doc(value = "根据量房单查询设计工单信息", order = 2, group = "/1.工单", author = AUTHOR_ZHANGJIANSHE, desc = "如果设计工单下有多个任务，除非所有任务都完成，返回工单下的任务信息,否则不会返回")
    @RequestMapping(value = "worksheet/query")
    public QueryDesignWorksheetResp queryDesignWorksheet(@RequestBody QueryDesignWorksheetRequest request) {
        return new QueryDesignWorksheetResp();
    }

    @Doc(value = "查询工单(任务单)列表", order = 3, group = "/1.工单", author = AUTHOR_ZHANGJIANSHE, desc = "WEB页面会调用此接口查询")
    @RequestMapping(value = "worksheet/queryList")
    public QueryDesignWorksheetListResp queryDesignWorksheetList(@RequestBody QueryDesignWorksheetListRequest request) {
        return new QueryDesignWorksheetListResp();
    }

    @Doc(value = "根据任务单查询任务信息", order = 4, group = "/1.工单", author = AUTHOR_ZHANGJIANSHE, desc = "WEB页面会调用此接口查询")
    @RequestMapping(value = "worksheet/task/query")
    public QueryDesignTaskResp queryDesignTask(@RequestBody QueryDesignTaskRequest request) {
        return new QueryDesignTaskResp();
    }

    @Doc(value = "提交平面图", order = 21, group = "/2.设计", author = AUTHOR_ZHANGJIANSHE, desc = "WEB页面会调用此接口查询")
    @RequestMapping(value = "worksheet/task/resource/submit")
    public TaskResourceSubmitResp taskResourceSubmit(@RequestBody TaskResourceSubmitReq request) {
        return new TaskResourceSubmitResp();
    }

    @Doc(value = "任务单审计", order = 31, group = "/3.审计", author = AUTHOR_ZHANGJIANSHE,
            desc = "审核不通过，记录审核结果，任务状态改为已驳回，审核通过，记录审核结果，检查设计工单是否全部完成审核，如果是，将设计工单转为已完成")
    @RequestMapping(value = "worksheet/task/audit")
    public TaskAuditResp taskAudit(@RequestBody TaskAuditRequest request) {
        return new TaskAuditResp();
    }
}
