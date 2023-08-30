package com.aac.webapp.controller;

import com.aac.webapp.dto.Consumer;
import com.aac.webapp.dto.ConsumerReport;
import com.aac.webapp.dto.ConsumerReportInt;
import com.aac.webapp.entity.ConsumerEntity;
import com.aac.webapp.service.Webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
public class WebController {
    @Autowired
    private Consumer consumer;

    @Autowired
    private Webservice webservice;
    @RequestMapping("/add")
    public int add(@RequestParam("a") int a,@RequestParam("b") int b){
        int sum = a+b;
        return sum;
    }
    @RequestMapping("/findConsumer")
    public Consumer getConsumerById(@RequestParam("ID") int id) throws InvocationTargetException, IllegalAccessException {
        consumer= webservice.getConsumerById(id);
        return consumer;
    }

    @RequestMapping("/getConsumerDetails")
    public List<ConsumerReportInt> getConsumerReport(){
        List<ConsumerReportInt> consumerReport= webservice.getConsumerDetails();
        return consumerReport;
    }



}
