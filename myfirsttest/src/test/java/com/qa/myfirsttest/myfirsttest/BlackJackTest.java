package com.qa.myfirsttest.myfirsttest;

import static org.junit.Assert.*;

import org.junit.*;
//import org.junit.BeforeClass;
//import org.junit.Test;


public class BlackJackTest  {

	@BeforeClass
	public static void method1()
	{
		System.out.println("Before Class");
	}
	@Test
	public void test()
	{
		BlackJack blackjack = new BlackJack();
		
		assertEquals(11,blackjack.play(10, 27));
		
		fail("FAILED");
	}
	@AfterClass
	public static void method2()
	{
		System.out.println("After Class");
	}
}
