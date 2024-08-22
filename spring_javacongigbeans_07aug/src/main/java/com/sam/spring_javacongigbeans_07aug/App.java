package com.sam.spring_javacongigbeans_07aug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sam.spring_javaconfigbeans_07aug.model.MyMessage;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyMessage.class);
        
        MyMessage myMessage =  context.getBean(MyMessage.class);
        
        myMessage.setMessage("Welcome to world of spring, Java based configuration");
        
        myMessage.getMessage();
        
        ((AbstractApplicationContext) context).close();
    }
}
