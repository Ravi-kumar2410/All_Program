package com.jsp.inheritance;
class D {
	int k=10;

}
class J extends D{
	int i=500;
}
public class Up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D a=new J();
		System.out.println(a.k);
		J j=(J)a;
		System.out.println(j.i);
		System.out.println(a.k);
		

	}

}
