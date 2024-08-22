package com.sam.myMavenPrj1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sam.myMavenPrj1.model.*;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        
    	 BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");
     	
         Employee e1 = (Employee) factory.getBean("empbean");
         Employee e2 = (Employee) factory.getBean("emp2");
         Employee e3 = (Employee) factory.getBean("emp3");
         
         System.out.println(e1 + "\n " + e2 + " \n" + e3);
    	
         ((AbstractApplicationContext) factory).close();
    }
}
