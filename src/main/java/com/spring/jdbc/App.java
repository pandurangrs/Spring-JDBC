package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

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
        
         StudentDao studentDao = context.getBean("studentdao",StudentDao.class);
         
         //Insert Data
//         Student student=new Student();
//         student.setId(4);
//         student.setName("Vikas");
//         student.setCity("Ambegao");
//         
//         int result = studentDao.insert(student);
//         System.out.println("Student added "+result);
        
         
         //Update data
         
//         Student student=new Student();
//         
//         student.setId(5);
//         student.setName("Viki");
//         student.setCity("Hari");
//         int r = studentDao.change(student);
//         System.out.println("Change student "+r);
         
         
         //Delete data
//         int r = studentDao.delete(4);
//        System.out.println("Delete Data "+r);
         
         //get single data for id
//         Student r = studentDao.getStudent(5);
//         System.out.println("get Data "+r);
   
         List<Student> allStudent = studentDao.getAllStudent();
         System.out.println("All data get = "+allStudent);
         for (Student students : allStudent) {
			System.out.println(students);
		}
         
         
        //1St method
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
//        //insert query
//        String query="insert into student(id,name,city) values(?,?,?)";
//        
//        //fire query
//        int result = jdbcTemplate.update(query,5,"Prathamesh Sharma","Khadki");
//        System.out.println("number of record inserted.. "+result);
        
        
    }
}
