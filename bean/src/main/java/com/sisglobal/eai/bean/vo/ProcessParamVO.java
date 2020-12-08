package com.sisglobal.eai.bean.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class ProcessParamVO {

	private Long runtimeTaskId;

	private String projectCode;

    private String processCode;

	private String processName;

	private String requestSource;

	private String taskCode;

    private Map<String, Object> data;

    private MessageParamVO messageParam;

	private String asyncProcessTaskId;
    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作人名称
     */
    private String operatorName;

    private boolean asynchronous = false;

}
