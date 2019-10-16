package com.shiyanlou.demo;

import com.shiyanlou.demo.loosely_coupled.OutputHelper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext context;

    public static void main(String[] args) {
         context = new ClassPathXmlApplicationContext(new String[] {"Spring-Output.xml"});

        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();
    }
}
