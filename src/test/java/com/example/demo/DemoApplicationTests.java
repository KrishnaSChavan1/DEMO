package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.example.One;

import com.example.demo.Calculator;;

// @SpringBootTest
class DemoApplicationTests {
	One one1=new One();
	Calculator c = new Calculator();

	@Test
	public void createMethod(){
		assertEquals(10,one1.add(1, 3));
	}
	// @Test
	// void contextLoads() {
	// }
	@Test
	public void tst(){
		assertEquals(11,one1.add(2, 3));
	}

	@Test
	public void ts(){
		assertEquals(5,c.add(2, 3));
	}


} 
