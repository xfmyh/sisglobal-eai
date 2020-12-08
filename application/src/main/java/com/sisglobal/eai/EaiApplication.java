package com.sisglobal.eai;

import com.sisglobal.eai.web.controller.ProcessController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EaiApplication {

    @Autowired
    private ProcessController processController;

    public static void main(String[] args) {

        SpringApplication.run(EaiApplication.class,args);
    }
}
