import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public static void main(String[] args) {
        ListNode lst1 = new ListNode(0);
        lst1.next = new ListNode(1);
        lst1.next.next = new ListNode(2);
        // lst1.next.next.next = new ListNode(4);
        // lst1.next.next.next.next = new ListNode(5);

        rotateRight(lst1, 4);
        // System.out.println(11%5);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        
        if(head != null && head.next == null){
            return head;
        }

        ListNode tmp = head;
        int size = 0;
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }

        if(k > size){
            k = k%size;
        }

        for(int i=0; i<k; i++){
            ListNode temp = head;
            ListNode prev = head;
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}