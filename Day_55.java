// Sum of Two Numbers in a Linked List

class Main {
    public int sumList(ListNode head) {
        int sum = 0;
        ListNode temp = head;
        while (temp != null) {
            sum = sum + temp.val;
            temp = temp.next;
        }

        return sum;
    }
}
