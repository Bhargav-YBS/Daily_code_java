class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public boolean search(ListNode head, int key) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        // Creates a  linked list: 10 -> 20 -> 30 -> 40
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        // Element  we gonna  search
        int key = 30;
        Solution obj = new Solution();
        boolean result = obj.search(head, key);
        System.out.println("Search result: " + result);
    }
}
