package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	//insert data
	public int insert(Student student) {
        //insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	
	
	//update data
	public int change(Student student) {
		
		String query="update student set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	//delete data
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	public Student getStudent(int studentId) {
		
		
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		//select single student data
		
		
		return student;
	}
	
	public List<Student> getAllStudent(){
		
		String query="select * from student";
		List<Student> students=this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}

}
