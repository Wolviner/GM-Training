package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Component
public class Book {
	
//	@Value("C++")
	@Value("${Book.bookName}")
	private String bookName;
//	@Value("re454")
	@Value("${Book.isbnNum}")
	private String isbnNum;
//	@Value("3423423")
	@Value("${Book.price}")
	private double price;
	@Autowired
	private Author author;

}
