package com.softwaretunnel.javaapp_h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.softwaretunnel.javaapp_h2.service.EmployeeService;

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
    ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(SpringBootApp.class, args);
    
    // execute swing
    System.setProperty("java.awt.headless", "false");
    EmployeeService employeeService=configurableApplicationContext.getBean(EmployeeService.class);
    new App().createGUI(employeeService);
  }


}
