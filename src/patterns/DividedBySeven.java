package patterns;

public class DividedBySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,3,58,70,56,63};
		int t=77;
		//int count=0;
		System.out.println(find(a,t));
	}
		public static int find(int[]a,int t) {
		int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]>=t) {
					//count++;
					return 0;
				}else {
					if(a[i]%7==0) {
						count++;

					}
				}
			}
			return count;
			
		}
}

	


