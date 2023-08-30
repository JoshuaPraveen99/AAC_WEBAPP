package com.aac.webapp.service;

import com.aac.webapp.dto.Consumer;
import com.aac.webapp.dto.ConsumerReport;
import com.aac.webapp.dto.ConsumerReportInt;
import com.aac.webapp.entity.ConsumerEntity;
import com.aac.webapp.repository.ConsumerRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class Webservice {
    @Autowired
    private ConsumerRepository consumerRepository;

    @Autowired
    private Consumer consumer;
    public void sample(){
        System.out.println("Service class to be added.");
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
    }

    public Consumer getConsumerById(int id) throws InvocationTargetException, IllegalAccessException {
        ConsumerEntity consumerEntity= consumerRepository.findById(id);
        BeanUtils.copyProperties(consumer,consumerEntity);
        return consumer;
    }

    public List<ConsumerReportInt> getConsumerDetails(){
        List<ConsumerReportInt> consumerReport=consumerRepository.getConsumerdetails();
        return consumerReport;
    }
}
