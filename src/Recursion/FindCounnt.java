package Recursion;

public class FindCounnt {
 //int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5896244;
		 //int count=0;
		System.out.println(m1(a));
	}
	public static int m1(int a) {
		if(a==0)
			return a;
		else {
		return m1(a/10)+1;
					
		}
	}

}
