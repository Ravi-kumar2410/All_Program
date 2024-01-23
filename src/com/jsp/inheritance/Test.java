package com.jsp.inheritance;

class A
{
	static void m1()
	{
		System.out.println("hindfe");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.println("hello");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.m1();
		//b.m2();
		

	}

}
