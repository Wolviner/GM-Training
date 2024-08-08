package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString

public class Department {
	@Value("${Department.depName}")
   private String depName;
	@Value("${Department.depId}")
   private int depId;
	public Department() {
		super();
	}
	public Department(String depName, int depId) {
		super();
		this.depName = depName;
		this.depId = depId;
	}
	
}
