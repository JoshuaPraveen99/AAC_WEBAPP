package com.aac.webapp;

import com.aac.webapp.repository.ConsumerRepository;
import com.aac.webapp.service.Webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class WebappApplication extends JFrame {

	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
		ApplicationContext context = SpringApplication.run(WebappApplication.class, args);
		SwingUtilities.invokeLater(() -> {
			GUI gui = context.getBean(GUI.class);
			try {
				gui.init();
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		});
	}
}

