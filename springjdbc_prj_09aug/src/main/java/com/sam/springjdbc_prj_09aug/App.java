package com.sam.springjdbc_prj_09aug;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);
    	logger.atLevel(Level.INFO);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        
        StudentJDBCTemplate stdJdbc = (StudentJDBCTemplate) ctx.getBean("jdbcTemplateObj");
        
        stdJdbc.create("Ravi", 19);
        stdJdbc.create("Rahul", 21);
        stdJdbc.create("Rohan", 22);
        stdJdbc.create("Rajesh", 20);
        
        System.out.println();
        
        List<Student> students = stdJdbc.listStudents();
        
        System.out.println("---listing all students---");
        for(Student s : students)
        	System.out.println(s.toString());
        
        System.out.println("---deleting student with id---");
        stdJdbc.delete(4);
        students = stdJdbc.listStudents();
        for(Student s : students)
        	System.out.println(s.toString());
        
        System.out.println("---updating student with id---");
        stdJdbc.update(15, 3);
        students = stdJdbc.listStudents();
        for(Student s : students)
        	System.out.println(s.toString());
        
        ((AbstractApplicationContext) ctx).close();
        
        logger.error("Error logging");
    }
}
