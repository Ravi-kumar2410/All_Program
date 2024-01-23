package patterns;

public class Convertintoaccessvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sucess";
		char reschsr='a';
		int count=0;
		while(s1.length()!=0) {
			char c=s1.charAt(0);
			String s2=s1.replace(c+"","");
			int length=s1.length()-s2.length();
			if(length>count) {
				count=length;
				reschsr=c;
			}
			else if(length==count && reschsr>c) {
				reschsr=c;
			}
			s1=s2;
			
		}

	}

}
