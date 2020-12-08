package com.sisglobal.eai.web.controller;


import com.sisglobal.eai.bean.vo.ProcessParamVO;
import com.sisglobal.eai.bean.vo.ProcessResultVO;
import com.sisglobal.eai.bean.vo.StopProcessParamVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/process")
public class ProcessController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessController.class);



    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "start")
    public List<ProcessResultVO> start(@Validated @RequestBody ProcessParamVO processParam){
        return Arrays.asList(new ProcessResultVO());
    }

    @PostMapping(value = "stop")
    public void stop(@Validated @RequestBody StopProcessParamVO stopProcessParam){

    }
}
