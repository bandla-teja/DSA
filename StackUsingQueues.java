import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> main = new LinkedList<>();
    Queue<Integer> helper = new LinkedList<>();

    public StackUsingQueues() {
        
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

    public static void main(String[] args){
        StackUsingQueues st = new StackUsingQueues();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.top());
        st.push(5);
        System.out.println(st.top());
    }
}
