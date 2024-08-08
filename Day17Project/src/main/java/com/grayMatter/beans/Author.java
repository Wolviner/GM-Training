package com.grayMatter.beans;

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
public class Author {
//	@Value("yojsd")
	@Value("${Author.author_name}")
private String author_name;
//	@Value("14")
	@Value("${Author.author_id}")
private String author_id;
}
