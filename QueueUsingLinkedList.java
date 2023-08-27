public class QueueUsingLinkedList {
    
    Node head;
    Node tail;

    class Node {
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public void insert(int val){

        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = tail.next;
    }

    public void remove(){
        if(head == null){
            System.out.println("Queue is empty. Nothing to remove.");
            return;
        }

        if(head != null && head.next == null){
            tail = null;
        }

        head = head.next;

    }

    public int front(){
        return head != null ? head.val : -1;
    }

    public static void main(String[] args){
        QueueUsingLinkedList qu = new QueueUsingLinkedList();
        qu.insert(1);
        qu.insert(2);
        System.out.println(qu.front());
        qu.insert(3);
        System.out.println(qu.front());
        qu.remove();
        System.out.println(qu.front());
        qu.remove();
        System.out.println(qu.front());
    }


}
