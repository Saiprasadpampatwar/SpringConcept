package com.example.helloworlddemo;

import com.example.helloworlddemo.component.DemoBean;
import com.example.helloworlddemo.component.EmployeeBean;
import com.example.helloworlddemo.controller.HelloWebController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworlddemoApplication {
    public static final Logger logger = LoggerFactory.getLogger(HelloworlddemoApplication.class);

    public static void main(String[] args) {
        System.out.println("Hii from sai");
        logger.debug("Welcome to the Spring Concepts Demo");
        ApplicationContext context = SpringApplication.run(HelloworlddemoApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.debug("Demo Bean = " + demoBean.toString());
        logger.debug("Autowire Annotation");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(2);
        employeeBean.setEname("Saiprasad pampatwar");
        employeeBean.showEmployeeDetails();
    }

}
