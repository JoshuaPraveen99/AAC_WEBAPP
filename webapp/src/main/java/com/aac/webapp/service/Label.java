package com.aac.webapp.service;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class Label  {

    public JLabel init(){

        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("C:\\Users\\Joshua\\Downloads\\webapp\\webapp\\src\\main\\java\\com\\aac\\webapp\\service\\java logo.png"));
        jLabel.setIconTextGap(50);
        jLabel.setBounds(new Rectangle(50,50));
        jLabel.setText("JAVA SWING GUI APPLICATION");
        jLabel.setSize(50,50);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalTextPosition(JLabel.TOP);
        return  jLabel;

    }
}
