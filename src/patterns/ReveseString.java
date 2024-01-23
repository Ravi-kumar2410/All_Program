package patterns;

public class ReveseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ravikumar";
		String rev="";
		char[]ch=s.toCharArray();
		
		for(int i=ch.length-1; i>=0;i--) {
			
			rev+=ch[i];
			
		}
		System.out.println(rev);

	}

}
