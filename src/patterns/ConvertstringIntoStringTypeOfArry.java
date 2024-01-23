package patterns;

import java.util.Arrays;

public class ConvertstringIntoStringTypeOfArry {

	public static void main(String[] args) {
		String s="java is easy ";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		String[]p=new String[count];
		int index=0;
		int i=0;
		int j=i+1;
		while(i<s.length()) {
			while(j<s.length()&&s.charAt(j)!=' ')
				j++;
			String temp=" ";
			int k=i;
			while(k<j) {
				temp+=s.charAt(k);
				k++;
			}
			p[index++]=temp;
			
			j++;
			i=j;
		}
		System.out.println(Arrays.toString(p));
		

	}

}
