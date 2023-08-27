import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> main;
    Stack<Integer> helper;

    public QueueUsingStacks(){
        main = new Stack<>();
        helper = new Stack<>();
    }
    public void insert(int val){
        while(!main.isEmpty()){
            helper.push(main.pop());
        }

        helper.push(val);

        while(!helper.isEmpty()){
            main.push(helper.pop());
        }
    }

    public int remove(){
        return main.pop();
    }

    public int front(){
        return main.peek();
    }

    public static void main(String[] args) {
        QueueUsingStacks qu = new QueueUsingStacks();
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
