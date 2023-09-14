import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node {
        int val;
        Node prev;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    Map<Integer, Node> map = new HashMap<>();
    int capacity;
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node(0);
        this.tail = new Node(0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
        Node res = map.get(key);
        if(res != null){
            Node nex = res.next;
            nex.prev = res.prev;
            res.prev.next = nex;
            Node headNext = head.next;
            head.next = res;
            res.prev = head;
            res.next = headNext;
            headNext.prev = res;
            return res.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.size() != capacity){
            if(!map.containsKey(key)){
                Node node = new Node(value);
                node.prev = head;
                node.next = head.next;
                head.next.prev = node;
                head.next = node;
                map.put(key, node);
            } else {
                Node existingNode = map.get(key);
                existingNode.prev.next = existingNode.next;
                existingNode.next.prev = existingNode.prev;
                existingNode.next = head.next;
                head.next.prev = existingNode;
                head.next = existingNode;
                existingNode.prev = head;
                map.get(key).val = value;
            }
        } else {

            if(!map.containsKey(key)){

                Integer keyToRemove = null;

                // Find the key corresponding to the value you want to remove
                for (Map.Entry<Integer, Node> entry : map.entrySet()) {
                    if (entry.getValue() == tail.prev) {
                        keyToRemove = entry.getKey();
                        break;
                    }
                }

                // Remove the entry with the specified value
                if (keyToRemove != null) {
                    map.remove(keyToRemove);
                }

                Node node = new Node(value);
                node.next = head.next;
                node.prev = head;
                head.next.prev = node;
                head.next = node;
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;
                map.put(key, node);
            } else {
                Node existingNode = map.get(key);
                existingNode.prev.next = existingNode.next;
                existingNode.next.prev = existingNode.prev;
                existingNode.next = head.next;
                head.next.prev = existingNode;
                head.next = existingNode;
                existingNode.prev = head;
                map.get(key).val = value;
            }
            
        }
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(2, 1);
        lRUCache.put(3, 2);
        System.out.println(lRUCache.get(3));
        System.out.println(lRUCache.get(2));
        lRUCache.put(4, 3);
        System.out.println(lRUCache.get(2));
        System.out.println(lRUCache.get(3));
        System.out.println(lRUCache.get(4));
    }
}