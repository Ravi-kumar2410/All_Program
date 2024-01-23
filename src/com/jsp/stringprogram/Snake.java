package com.jsp.stringprogram;

public class Snake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=1;
		for(int i=1;i<=4;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=5;j++)
				{
					System.out.print(value+"\t");
					value++;
				}
			}
			else
			{
			int temp=value+5-1;
			for(int j=5;j>=1;j--)
			{
				System.out.print(temp+"\t");
				temp--;
				value++;
			}
				
			}
			System.out.println();
		}

	}

}
