package patterns;

public class Tringle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			for(int i=5;i>=1;i--) {
				for(int j=1;j<i;j++) {
					System.out.print(" ");
				}
				for(int k=5;k>i-1;k--) {
					System.out.print(k);
				}
				System.out.println();
			}

	}

}
