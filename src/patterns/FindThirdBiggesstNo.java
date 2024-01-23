package patterns;

public class FindThirdBiggesstNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12345;
		int big=0;
		while(n>99) {
			if(n%1000>big) {
				big=n%1000;
		
			}
			n=n/10;
		}
		System.out.println(big);

	}

}
