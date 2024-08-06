package com.grayMatter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.grayMatter.beans.Author;
import com.grayMatter.beans.Book;

@Configuration
//configuration title to the application
@ComponentScan("com.grayMatter.beans")
@PropertySource("classpath:bookauth.properties")
public class BookConfig {
	
	//define beans 
	//supply values to bean properties
//	@Bean(name="book")
//	public Book getBook() {
//		return new Book("Java","A9877",230,getAuthor());
//	}
////	@Bean(name="author")
//	public Author getAuthor() {
//		
//		return new Author("pomer","12134");
//		
//	}

}
