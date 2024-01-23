package arrayses;

class Queue{
	int size=10;
	int[] a=new int[size];
	int count=0;
	int front,rear=0;
	 
	public void add(int x) {
		
		a[rear]=x;
		rear++;
		count++;
		
	}
	int size() {
		return count;
	}
	
	int remove() {
		int x=a[front];
		front++;
		count--;
		return x;
	}
	int top() {
		return a[front];
	}
}

public class QueueImplimenttation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.size());
		System.out.println(q.remove());
		System.out.println(q.size());
		System.out.println(q.remove());
		System.out.println(q.top());

	}

}
