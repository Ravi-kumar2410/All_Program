package Recursion;

public class R1 {
	
	static int m2(int a) {
		//System.out.println(a);
		if(a<=0) 
			return a;
			System.out.println(a);
			return m2(a-1);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		m2(a);

	}

}
