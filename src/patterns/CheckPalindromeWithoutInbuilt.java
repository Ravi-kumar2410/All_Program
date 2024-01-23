package patterns;

import java.util.Scanner;



public class CheckPalindromeWithoutInbuilt {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s="madam";
			Scanner sc=new Scanner(s);
			//String s="madam";
			String temp="";
			sc.useDelimiter("");
			while(sc.hasNext()) {
				String s1=sc.next();
				temp=s1+temp;
			}
			if(s.equals(temp)) {
				System.out.println("palindrom");
			}else
				System.out.println("not palindrom");

		}

	}