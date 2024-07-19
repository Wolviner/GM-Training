package com.grayMatter;

public class AgeNotSufficientException extends Exception {
String name;

public AgeNotSufficientException(String name) {
	super();
	this.name = name;
}

}
