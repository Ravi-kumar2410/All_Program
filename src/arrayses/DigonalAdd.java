package arrayses;

public class DigonalAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]a= {{1,2,3},{3,5,4},{9,5,8}};
	int sum=0;
		
		for(int i=0;i<a.length;i++) {
			 sum+=a[i][i];
		}
		
			System.out.println(sum);
		

	}

}
