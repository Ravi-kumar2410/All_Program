package Recursion;

public class ReverseNo {
static int t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123854769;
		rev(n);

	}
	public static int rev(int n) {
		if(n==0)return n;
		else
			 t=n%10;
			System.out.print(t);
			return rev(n/10);
		
	}

}
