package com.jsp.stringprogram;

public class Pemutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		int start=0;
		int end=s.length()-1;
		Pemutation p=new Pemutation();
		p.cal(s, start, end);
	}
	 public void cal(String s,int start,int end)
{
			if(start==end) {
				System.out.println(s);
			  return;
			}else {
			for(int i=start;i<=end;i++) 
			{
				String s1=swap(s,start,i);
				cal(s1,start+1,end);
			}
		 }
		
		}
		public static String swap(String s,int i,int j) {
			char []ch=s.toCharArray();
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		    return  new String(ch);
			
		

		 }	

}
