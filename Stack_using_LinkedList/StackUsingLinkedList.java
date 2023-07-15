class Node{
    public Object data;
    public Node next;
    
}
public class StackUsingLinkedList {
    private int size =  0;
    private Node head;
    private int top=-1;
    public StackUsingLinkedList(int size) {// constructor
        this.size = size;
        this.head=null;
    }
    public void push(String i) {
        if(top>=size-1) {
            System.out.println("Stack is Full");
        } else {
             Node node = new Node();
            node.data = i;
            node.next = this.head;
            this.head = node;
		    this.top++;

        }
    }

    public void pop() {
		if(this.top<0) {
			System.out.println("Stack is empty");
		}else {
            Object temp = head.data;
			this.head=this.head.next;
			this.top--;;
            System.out.println("popped item is "+temp);
		}
	}

    public void display() {
		Node current = this.head;
		while(current!=null) {
			System.out.println(current.data);
            System.out.println("--------------");
			current=current.next;
		}
	}


    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList(5);
        stack.pop();
        stack.push("vinay");
        stack.push("yaswanth");
        stack.push("sudharasan");
        stack.push("charan");
        stack.display();
        stack.push("dileep");
        stack.push("siva");
        stack.pop();

        stack.display();
    }

}

