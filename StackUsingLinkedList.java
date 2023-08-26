public class StackUsingLinkedList {

    Node head;

    public StackUsingLinkedList(){
        this.head = null;
    }

    class Node {
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public void push(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public int pop(){

        if(head == null){
            return -1;
        }

        Node node = head;
        head = head.next;

        return node.val;
    }

    public int peek(){
        return head.val;
    }


    public static void main(String[] args) {
        StackUsingLinkedList st = new StackUsingLinkedList();
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
