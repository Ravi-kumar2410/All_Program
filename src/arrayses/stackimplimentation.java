package arrayses;

public class stackimplimentation {
	
	
	
	public class StackUsingLinkList {
		  
		  public class Node {
		    int data;
		    Node next;
		    
		    public Node() {
		      this.data = data;
		      next = null;
		    }
		  }

		  public static class Stack {
		    public Node head;

		    public boolean isEmpty() {
		      return head == null;
		    }

		    public void add(int data) {
		      Node newNode = new Node();
		      if (isEmpty()) {
		        head = newNode;
		        return;
		      }
		      newNode.next = head;
		      head = newNode;
		    }

		    public int pop() {
		      if (isEmpty()) {
		        return -1;
		      }
		      int top = head.data;
		      head = head.next;
		      return top;
		    }

		    public int peek() {
		      if (isEmpty()) {
		        return -1;
		      }
		      return head.data;
		    }
		  }

		  public static void main(String[] args) {
		    Stack s = new Stack();
		    s.add(1);
		    s.add(2);
		    s.add(3);
		    s.add(4);

		    while (!s.isEmpty()) {
		      System.out.println(s.peek());
		      System.out.println(s.pop());
		    }
		  }
	}
}

