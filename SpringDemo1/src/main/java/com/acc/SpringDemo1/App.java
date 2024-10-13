package com.acc.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.acc.SpringDemo1.model.BaseballCoach;
import com.acc.SpringDemo1.model.Coach;
import com.acc.SpringDemo1.model.CricketCoach;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
        
        Coach trackCoach = context.getBean("trackCoach",Coach.class);
        System.out.println(trackCoach.getDailyWorkout());
        
        BaseballCoach bc = context.getBean("myBaseballCoach",BaseballCoach.class);
        System.out.println(bc.getDailyWorkout());
        System.out.println(bc.getDailyFortune());
        
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach);
        
//        context.close();
        context.registerShutdownHook();
    }
}
