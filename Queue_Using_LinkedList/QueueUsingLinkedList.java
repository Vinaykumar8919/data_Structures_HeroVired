class Node{
    public Object data;
    public Node next;
    
}
public class QueueUsingLinkedList {
    private int size =  0;
    private Node head;
    private int count=-1;
    public QueueUsingLinkedList(int size) {// constructor
        this.size = size;
        this.head=null;
    }
    public void enQueue(String i) {
        if(count>=size-1) {
            System.out.println("Queue is Full");
        } else {
             Node node = new Node();
            node.data = i;
            node.next = this.head;
            this.head = node;
		    this.count++;

        }
    }

    public void deQueue() {
		Node current=this.head;
		if(this.head==null) {
			System.out.println("Queue is empty");
		}else {
			Object temp="";
			while(current.next.next!=null) {
				current=current.next;
				temp = current.next.data;

			}current.next=null;

			System.out.println("Deleted item is : "+temp);
			this.count-=1;
		}
	}

    public void display() {
		Node current = this.head;
		while(current!=null) {
			System.out.print(current.data+" | ");
			current=current.next;
		}
        System.out.println();
	}


    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList(5);
        q.deQueue();
        q.enQueue("vinay");
        q.enQueue("yaswanth");
        q.enQueue("sudharasan");
       q.enQueue("charan");
        q.display();
        q.enQueue("dileep");
        q.enQueue("siva");
        q.deQueue();

        q.display();
    }

}

