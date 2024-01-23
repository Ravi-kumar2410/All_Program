package Recursion;

public class Factorial {
    static int p=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(3);
	
		//int p=1;
		 System.out.println(p);

	}
	
	public static void m1(int n) {
		if(n<=0)return;
		 p = p*n;
		 System.out.println(p);
		m1(n-1);
	}

}
