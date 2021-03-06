package com.gcit.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcit.LmsApplication;
import com.gcit.dao.AuthorDao;
import com.gcit.domain.Author;

@RestController
public class LMSAuthorController {
	private static final Logger logger = LoggerFactory.getLogger(LmsApplication.class);

	@Autowired
	AuthorDao authorDao = new AuthorDao();
	@RequestMapping("/author/{authorId}")
	public Author getAuthor(@PathVariable(value = "authorId") int authorId) throws SQLException {
		logger.debug("this is a log message from the controller class");
		Author author = authorDao.getAuthorById(authorId);
		return author;
	}
}
