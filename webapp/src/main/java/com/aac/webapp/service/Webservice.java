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
        System.out.println("Service added");
        System.out.println("Service modified");
        System.out.println("Service2 added");

    }
}
