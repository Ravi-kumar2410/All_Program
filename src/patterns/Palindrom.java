package patterns;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ravikumar";
		String rev="";
		char[]ch=s.toCharArray();
		
		for(int i=ch.length-1; i>=0;i--) {
			
			rev+=ch[i];
			
		}
		if(rev.equals(ch)) {
			System.out.println("palindron");
		}else {
			System.out.print("not palindron");
		}

	}

}
