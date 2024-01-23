package patterns;

public class LengthFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="the cirrent version of java is jdk21";
		
		//String arr[]=s.split(" ");3
		char[]ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ');
			count++;
		}
		System.out.println(count);

	}

}
