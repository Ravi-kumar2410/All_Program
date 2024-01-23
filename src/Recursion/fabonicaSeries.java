package Recursion;

public class fabonicaSeries {
	static int a=0;
	static int b=1,c;

	public static void main(String[] args) {
		// TODO Auto-generated method st
		//fabonicaSeries f=new fabonicaSeries();
		fo(5);
		//System.out.println(c);
	}
	
		
		public static void fo(int n) {
			
			if(n>=1) { 
			
				int c=a+b;
				System.out.println(c);
			 a=b;
			 b=c;
				fo(n-1);
			}
			
			
			
				
				
				
			}
	
		

	

}
