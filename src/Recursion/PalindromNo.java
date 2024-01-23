package Recursion;

public class PalindromNo {
 static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1821;
		  //int c=0;
		int b=m1(n);
		if(b==n)
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");
	}
	
	public static int m1(int n) {
		if(n==0)return c;
		else {
			int rem=n%10;
		    c=c*10+rem;
			return m1(n/10);
					//return m1(n/10);
		}
		
	}

}
