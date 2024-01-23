package Recursion;

public class AddDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3455;
		//int sum=m1(a);

		System.out.println(m1(a));
		//m1(a);

	}
	
	public static int m1(int a) {
		if(a==0)
			return a;
		else {
			int t=a%10;
			return t+(m1(a/10));
			//a=m1(a/10);
					
		}
		
	}

	
}
