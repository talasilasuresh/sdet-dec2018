package com.training.businesslogic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.businesslogic.MyBusinessLogic;

public class MyBusinessLogicTest {

 MyBusinessLogic mbl = null;
 
 
    @BeforeClass
    public static void setUpBeforeClass(){
    	System.out.println("Hi I am in before class, and only once");
    }
 
    @AfterClass
	public static void tearDownAfterClass(){
		System.out.println("I am in after class and only once");
	}

	@Before
	public void setUp(){
		mbl = new MyBusinessLogic();
		System.out.println("I am in before");
	}
	
	
	@After
	public void tearDown(){
		System.out.println("I am in after");
	}

	@Test(timeout=500)
	public void insertRecordTest() {
		
		int retVal = mbl.insertRecord(101, "Harry");

		assertEquals(1, retVal);

	}

	@Test(expected=RuntimeException.class)
	public void sayHelloTest() {
		MyBusinessLogic mbl = new MyBusinessLogic();
		String name = "Vimala";
		String retVal = "Hello " + name;

		assertEquals(retVal, mbl.sayHello(name));

	}

}
