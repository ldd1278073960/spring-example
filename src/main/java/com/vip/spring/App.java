package com.vip.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) {

        //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //new FilmSystemXmlApplication();
        //用注解
        //new AnnotationConfigApplicationContext();

        //获取容器的对象
        //参数：注册时声明的id属性的值或者name属性的值
        App app = (App) context.getBean("App");
        System.out.println(app);
        //或者
        App app1 = context.getBean("App", App.class);
        System.out.println(app1);
    }
}
