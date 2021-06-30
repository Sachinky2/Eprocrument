package com.eproc.eproc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	//Create the table
	public void createTable() {
		var query="CREATE TABLE student(id SERIAL PRIMARY KEY , name varchar(255))";
		int update = this.jdbcTemplate.update(query);
		System.out.println(update);
	}

}
