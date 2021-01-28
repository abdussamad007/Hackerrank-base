package com.abdus.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindGCDTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindGcd() {
		assertEquals(5, FindGCD.gcd(5, 10));
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testFindGcdArr() {
		int[] arr = {10,15,20};
		assertEquals(5, FindGCD.findGCDOfArray(arr));
		
		//fail("Not yet implemented");
		
		int[] arr1 = {11,15,20};
		assertEquals(1, FindGCD.findGCDOfArray(arr1));
		
	}

}
