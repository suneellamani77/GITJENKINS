package com.sj.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void sample(){
		int a=1;
		int b=2;
		
		assertTrue(a+b==3);
	}
	
	@Test
	public void sample2(){
		int a=5;
		int b=2;
		
		assertTrue(a+b==7);
	}

}
