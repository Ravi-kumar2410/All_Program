package com.jsp.inheritance;

 class Doa {
	int f=100;

}
class V extends Doa{
	int i=500;
}

public class Dow{
	public static void main(String[]args)
	{
		Doa a=new Doa();
		System.out.println(a.f);
	Doa b=(Doa)a;
		System.out.println(b.f);
	}
	}
