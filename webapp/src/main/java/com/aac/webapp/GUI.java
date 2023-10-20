package com.aac.webapp;

import com.aac.webapp.service.Label;
import com.aac.webapp.service.Webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

@Component
public class GUI extends JFrame {
    @Autowired
    Webservice webservice;

    @Autowired
    Label label;



    public void init() throws InvocationTargetException, IllegalAccessException {
        String title= webservice.getConsumerById(1).getName();
        this.setTitle(title);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label.init());
        this.setVisible(true);


    }
}
