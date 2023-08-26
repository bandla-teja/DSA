public class StackUsingArray {
    private int[] data;

    private int ptr = -1;

    public StackUsingArray(){
        data = new int[10];
    }

    public void push(int val){

        if(isFull()){
            System.out.println("Stack is full");
            return;
        }

        data[++ptr] = val;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return data[ptr--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }


    public static void main(String[] args){
        StackUsingArray st = new StackUsingArray();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(5);
        System.out.println(st.peek());
    }

}
