package Recursion;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		int i=0;
		int j=s.length()-1;
			System.out.println(m1(s,i,j));
		

	}
	public static boolean  m1(String s,int i,int j) {
		if(s.charAt(i)!=s.charAt(j))return false;
		if(j<=i)return true;
			return m1(s,i+1,j-1);

	}

}
