package com.gcit.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.gcit.LmsApplication;
import com.gcit.domain.Author;
import com.mysql.jdbc.Connection;

@Component
public class AuthorDao {
	private static final Logger logger = LoggerFactory.getLogger(LmsApplication.class);

	// @Autowired
	// JdbcTemplate jdbcTemplate;

	public Connection getConnection() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/library",
				"root", "root");
		return conn;
	}

	public Author getAuthorById(int authorId) throws SQLException {
		logger.debug("this is a log message from the DAO class");
		
		Author author = new Author();
		author.setAuthorId(1);
		author.setAuthorName("Jane Dow");
		logger.debug(author.toString()+ " is the author you asked for");
		return author;
	}
}

// class AuthorRowMapper implements RowMapper<Author>
// {
// public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
// Author author = new Author();
// author.setAuthorId(rs.getInt("authorId"));
// author.setAuthorName("authorName");
// return author;
// }
//
// }