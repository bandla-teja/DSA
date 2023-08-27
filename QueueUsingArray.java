public class QueueUsingArray {
    
    int[] data;

    int ptr = 0;

    public QueueUsingArray(){
        data = new int[10];
    }

    private boolean isFull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr == 0;
    }

    public void insert(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        data[ptr++] = val;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = data[0];

        for(int i=1; i<data.length; i++){
            data[i-1] = data[i];
        }

        return removed;
    }

    public int front(){

        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return data[0];
    }

    public static void main(String[] args) {
        QueueUsingArray qu = new QueueUsingArray();
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
