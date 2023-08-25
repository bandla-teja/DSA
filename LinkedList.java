public class LinkedList {

    Node head;
    Node tail;
    int size;

    public LinkedList(){
        this.size = 0;
    }

    class Node {
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(size == 0){
            tail = node;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(size == 0){
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }
        
        if(index == size){
            insertLast(val);
            return;
        }

        int i=0;
        Node temp = head;
        Node prev = head;
        while(temp != null){
            if(i == index){
                break;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
        Node node = new Node(val);
        prev.next = node;
        node.next = temp;

        size++;
    }

    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insert(3, 1);
        list.insertLast(4);
        list.insert(2, 1);
        list.traverse();
    }

}
