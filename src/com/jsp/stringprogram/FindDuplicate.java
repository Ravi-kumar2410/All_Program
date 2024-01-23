package com.jsp.stringprogram;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ravi  is ravi is good ravi.ravi ";
		String [] s=a.split(" ");
		boolean [] b=new boolean[s.length];
		for(int i=0;i<s.length;i++) {
			if(b[i]) {
				continue;
				
			}
		
		int count=1;
		for(int j=i+1;j<s.length;j++) {
			if(s[i].equalsIgnoreCase(s[j])) {
				count++;
				b[j]=true ;
			}
		}
		if(count > 1) {
			System.out.print(s[i]+"\t");
		}

	}
	}

}
