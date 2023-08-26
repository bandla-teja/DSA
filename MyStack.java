import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyStack {

    Queue<Integer> main = new LinkedList<>();
    Queue<Integer> helper = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        helper.add(x);
        while(!main.isEmpty()){
            helper.add(main.poll());
        }
        while(!helper.isEmpty()){
            main.add(helper.poll());
        }
    }
    
    public int pop() {
        return main.poll();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}
