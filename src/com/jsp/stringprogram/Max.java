package com.jsp.stringprogram;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ahhfrsasaftf";
		char[]ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
				ch[j]=' ';
					count ++;
				}
			}
			if(ch[i]!=' ')
				System.out.println(ch[i]+" "+count);
					
		}

	}

}
