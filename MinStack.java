import java.util.Stack;

class MinStack {

    Stack<Node> stack = new Stack<>();

    class Node {
        int val;
        int min;
        public Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(!stack.isEmpty()){
            Node peekNode = stack.peek();
            int minValTillNow = Math.min(val, peekNode.min);
            stack.push(new Node(val, minValTillNow));
        } else {
            stack.push(new Node(val, val));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek().val;
        }
        return -1;
    }
    
    public int getMin() {
        if(!stack.isEmpty()){
            return stack.peek().min;
        }
        return -1;
    }
}