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
	
	@Test
	public void sample3(){
		int a=2;
		int b=2;
		
		assertTrue(a+b==4);
	}
	
	@Test
	public void sample4(){
		int a=2;
		int b=9;
		
		assertTrue(a+b==7);
	}

}
