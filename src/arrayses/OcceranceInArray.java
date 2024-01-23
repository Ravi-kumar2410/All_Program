package arrayses;

public class OcceranceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={1,2,3,4,3,4,3,2,2,2};
		int max=0;
		int repatedEle=0;
		
		for(int i=0;i<=a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			}
			
			
			if(max<count) {
				max=count;
				repatedEle=a[i];
				
			}
			
			

		}
		System.out.println(repatedEle +" " +"is repeted max time" + max);

	}

}
