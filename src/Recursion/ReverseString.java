package Recursion;

public class ReverseString {
	//static String s1="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hydtam";
		String r="";
		int i=s.length()-1;
			System.out.println(m1(s,r,i));
		

	}
	public static String m1(String s,String r,int i) {
		if(i<0)return r;
		else
			return m1(s,r+s.charAt(i),i-1);
		
	}

}
