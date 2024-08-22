package com.sam.spring.java.configbeans_07aug_2;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sam.spring.java.configbeans_07aug_2.model.Car;
import com.sam.spring.java.configbeans_07aug_2.model.CarConfig;

public class App 
{
    public static void main( String[] args )
    {

    	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
    	 
        Car myCar = ctx.getBean(Car.class);
        
        myCar.show();
        
        ((AbstractApplicationContext) ctx).close();
    }
    
}
