package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddNumbersTestCase {
	Sum sum;
	int count;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		sum=new Sum();
		count++;
		System.out.println("Before Each "+count);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		@SuppressWarnings("unused")
		Sum sum = null;
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(20, sum.addNumbers(10, 10));
	}
	
	@Test
	void test2() {
		//fail("Not yet implemented");
		assertEquals(0, sum.addNumbers(-10, 10));
	}

}
