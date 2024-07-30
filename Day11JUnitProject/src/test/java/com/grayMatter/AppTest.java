package com.grayMatter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
//	@Test
//	public void testPrintName() {
//		assertEquals("User",App.printName("User"));
//		
//	}
//	@Test
//	public void testAdd() {
//		assertEquals((Double)10.0,(Double)App.add(3.0,7.0));
//		
//	}
//	@Test
//	public void testSub() {
//		assertEquals(15,App.sub(20,5));//integer
//		
//	}
//	@Test
//	public void testMul() {
//		assertEquals(15,App.mul(3,5));
//		
//	}
//	@Test
//	public void testDiv() {
//		
//		assertEquals((Double)(100.0),(Double)App.div(200.0,2.0));
//		
//	}
//	@Test
//	public void testSearch() {
//		int arr[]= {1,23,56,84,78};
//		int key=84;
//		assertEquals(3, Calculator.findKey(arr,key));
//	}
//	@Test
//	public void testaArayEquals() {
//		int exparr[]= {34,56,78,12,39};
//		int actarr[]= {34,56,78,12,39};
//		assertArrayEquals(exparr, Calculator.arrayEquals(actarr));
//	}
//	@Test
//	public void testCheckString() {
//		assertNull(Calculator.checkString());
//	}
//	@Before
//	public void printLogBeforeEachMethod() {
//		System.out.println("Before Every Test");
//	}
//	
//	@After
//	public void printLogAfterEachMethid() {
//		System.out.println("After Every Test");
//	}
//	
//	@BeforeClass (forJUNit4)   JUNit 5 is BeforeAll
//	public static void printBeforeClass() {
//		System.out.println("Before Class Execution");
//	}
//	@AfterClass (forJUNit4)   JUNit 5 is AfterAll
//	public static void printAfterClass() {
//		System.out.println("After Class Execution");
//	}
	
	@Test
	@Category(MarkerInterface.class)
	public void testCreateStudent() {
		
		Student expStudent=new Student("user",123,22);
		assertEquals(expStudent,Calculator.createStudent());
	}
//	static Connection con=null;
//	@BeforeClass
//	public static void testGetConnection()throws SQLException,ClassNotFoundException {
//		
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/graymatterdb","root"
//					,"Password");
//			DBConnection db=new DBConnection();
////			assertEquals(con,db.getConnection());
//	}

//	@Test
//	public void testConnection() {
//		assertNotNull(con);
//	}
}
