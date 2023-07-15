class Node{
    public Object item;
    public Node next;
}


public class linkedListImp {
    private int size =  0;
    private Node head;
    public linkedListImp() {// constructor
        this.size = 0;
        this.head=null;
    }


    public void addAtEnd(String i) {
        Node node = new Node();
        node.item = i;
        Node current=this.head;

        if(this.head==null) {
            this.head=node;
            this.head.next=null;
            this.size=1;
            System.out.println(this.head.toString());
        } else {
            while(current.next!=null) {
                current=current.next;
            }
            current.next=node;
            node.next=null;
            this.size+=1;
        }
    }
    public void addAtStarting(String i) {
        Node n = new Node();
        n.item = i;
        n.next = this.head;
        this.head = n;
		this.size++;
    }

    public void addAtMiddle(String i,int pos)
	{
		Node node=new Node();
		Node current=this.head;
		if(this.head!=null && pos<=this.size)
		{
			for(int j=0;j<pos;j++) {
				current=current.next;
			}
			node.item=i;
			node.next=current.next;
			current.next=node;
			this.size+=1;
		}
		else
		{
			System.out.println("position is greater than size");
		}
	}
    public void deleteAtEnd() {
		Node current=this.head;
		if(this.head==null) {
			System.out.println("list is empty");
		}else {
			Object temp="";
			while(current.next.next!=null) {
				current=current.next;
				temp = current.next.item;

			}current.next=null;

			System.out.println("Deleted item is : "+temp);
			this.size-=1;
		}
	}
	public void deleteAtStart() {
		if(this.head==null) {
			System.out.println("List is empty");
		}else {
			this.head=this.head.next;
			this.size-=1;
            System.out.println("Deleted Successfully");
		}
	}


	//
	public void deleteAtMiddle(int pos) {
		Node current = this.head;
		if(this.head!=null && pos<=this.size) {
		    for(int j=0;j<pos-1;j++) {
			    current=current.next;
		    }
            current=current.next.next;
		    this.size-=1;
		}else {
			System.out.println("Position is greater than size");
		}
	}

	public void display() {
		Node current = this.head;
		while(current!=null) {
			System.out.print(current.item+"-> ");
			current=current.next;
		}
		System.out.println("END");
	}


	public void find(int value) {
        Node current = this.head;
        boolean flag = false;
        for(int i = 0; i < size; i++) {
            if (current.item.equals(value)) {
                System.out.println("Element present at index " + i);
                flag = true;
                // break;
            }
            
            current = current.next;

        }
        if (!flag) {
            System.out.println("Element not present in Linked List");
        }

    }

    public static void main(String[] args) {
		linkedListImp list = new linkedListImp();
		list.addAtEnd("vinay");
		list.addAtEnd("siva");
		list.addAtStarting("sudharasan");
		list.addAtEnd("yaswanth");
		list.addAtMiddle("dileep", 2);
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteAtStart();
		list.display();
        

    }

}