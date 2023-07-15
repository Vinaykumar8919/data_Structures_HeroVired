public class Queue{
    private static int front;
    private static int rare;
    private static int size;
    private static Object[] queue;
    public Queue(int size) {
        this.size=size;
        this.front=-1;
        this.rare=-1;
        queue = new Object[size];
    }

    public void enQueue(Object value) {
        if(rare==-1)
            rare=0;
        if(front==size-1) {
            System.out.println("Queue is full");
        } else {
            front++;
            queue[front]=value;
            diplay();
            
        }
        
            
    }

    public void deQueue() {
        if(rare==-1||rare>front) {
            System.out.println("Queue is Empty");
        } else {
            Object temp = queue[rare];
            rare++;
            System.out.println("deQueue element is " +temp);
        }

    }

    public void diplay() {
        for(int i=rare; i<=front; i++) {
            System.out.print(" | "+queue[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60); 
        q.deQueue();
        q.enQueue(60);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);
        q.deQueue(); 
        q.enQueue(60);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.diplay();
    }

}