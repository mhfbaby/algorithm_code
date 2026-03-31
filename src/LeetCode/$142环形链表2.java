package LeetCode;

public class $142环形链表2 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode l1 = head;
                ListNode l2 = fast;
                while (l1 != l2){
                    l1 = l1.next;
                    l2 = l2.next;
                }
                return l1;
            }
        }
        return null;
    }
}
