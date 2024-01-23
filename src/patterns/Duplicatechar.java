package patterns;

public class Duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="raviakau";
		String s2=" ";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			boolean f=true;
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=' ';
					f=false;
				}
				
			}
		
		if(!f) {
			ch[i]=' ';
		}
		}
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=' ')
				s2+=ch[i];
			}
		
		
			System.out.print(s2);
		
		

	}

}
