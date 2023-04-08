package com.edil.springProject.Exercise;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@Configuration
public class Exercise {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Exercise.class);

        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}