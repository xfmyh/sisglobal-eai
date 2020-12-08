package com.sisglobal.eai.bean.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StopProcessParamVO {

	private Long runtimeTaskId;

    private Long operatorId;

    private String operatorName;

}
