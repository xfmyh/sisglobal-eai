package com.sisglobal.eai.bean.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class MessageParamVO {


	/**
     * message uid
     */
    private String mid;
    /**
     * 应用编码
     */
    private String appCode;
    /**
     * 项目编码
     */
    private String projectCode;
    /**
     * 业务主键KEY
     */
    private String bizKey;
    /**
     * 消息类型
     */
    private String messageType;
    /**
     * 优先级
     */
    private Integer priority;
    
    /**
     * 原始数据
     */
    private String bizData;
    
    /**
     * 来源
     */
    private String source;

    /**
     * 来源类型
     */
    private String sourceType;
    /**
     * 业务数据日志记录自定义字段
     */
    private Map<String, Object> customData;

}
