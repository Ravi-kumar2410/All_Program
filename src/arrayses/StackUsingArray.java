package arrayses;


class Stack{
	
	//int size=5;
	int[]arr=new int[5];
	int top=-1;
public void add(int x) {
		++top;
		arr[top]=x;
		
}
int pop() {
	int x=arr[top];
	top--;
	return x;
}

int peek() {
	return arr[top];

}
 int size() {
	 return top+1;
 }
 }
public class StackUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack q=new Stack();
		q.add(1);
		q.add(2);
		q.add(3);
		//System.out.println(q.size());
		System.out.println(q.pop());
		System.out.println(q.size());
		System.out.println(q.pop());
		System.out.println(q.peek());
	}

}
