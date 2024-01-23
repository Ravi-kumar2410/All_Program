package com.jsp.stringprogram;

public class Heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
			if((i==0 && j%3!=0)|| (i==1&&j%3==0) || (i-j==2)||(i+j==8))
			
				System.err.print("* ");
			
			else
				System.out.print("  ");
		}
		System.out.println( );
				
		}

	}
}


