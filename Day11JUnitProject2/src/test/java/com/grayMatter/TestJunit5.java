package com.grayMatter;



	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	public class TestJunit5 {




	    @BeforeAll
	    public static void setupBeforeAll() {
	        System.out.println("Setup before all tests");
	    }

	    @AfterAll
	    public static void teardownAfterAll() {
	        System.out.println("Teardown after all tests");
	    }

	    @BeforeEach
	    public void setupBeforeEach() {
	        System.out.println("Setup before each test");
	    }

	    @AfterEach
	    public void teardownAfterEach() {
	        System.out.println("Teardown after each test");
	    }

	    @Test
	    public void test1() {
	        System.out.println("Running test1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Running test2");
	    }
	}


