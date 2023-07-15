import java.security.PublicKey;

public class StackArray{
    private Object[] stackarray;
    private int size;
    private int top;

    public StackArray(int size) {
        this.size = size;
        this.top=-1;
        stackarray = new Object[size];
    }

    public void push(Object value) {
        if(top==size-1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stackarray[top]=value;
        }
    }

    public void pop() {
        if(top==-1) {
            System.out.println("Stack is Empty");
        } else {
            Object temp = stackarray[top];
            stackarray[top]=null;
            top--;
            System.out.println("popped object is : "+temp);
        }
    }

    public Object peek() {
        return stackarray[top];
    }

    public void display() {
        for(int i=0; i<=top; i++) {
            System.out.print(stackarray[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
     
        StackArray st = new StackArray(6);
        st.push(89);
        st.push(10);
        st.push(50);
        st.push(89);
        st.display();
        st.push(89);
        st.push(10);
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.display();

    }

}