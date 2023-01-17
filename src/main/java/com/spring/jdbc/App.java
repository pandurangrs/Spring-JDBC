package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("My Program Started ...");
    	//spring jdbc =>JdbcTemplate
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        
        //fire query
        int result = jdbcTemplate.update(query,5,"Prathamesh Sharma","Khadki");
        System.out.println("number of record inserted.. "+result);
        
        
    }
}
