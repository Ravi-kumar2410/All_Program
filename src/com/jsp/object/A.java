package com.jsp.object;

public class A {
	void m1()
	{
		System.out.println("m1 is caling");
	}
	public class Test{
		public static void main(String []args) {
		A a=new A();
		a.m1();
		}
	}

}
