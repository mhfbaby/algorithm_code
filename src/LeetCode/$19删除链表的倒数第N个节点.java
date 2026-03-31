package LeetCode;

public class $19删除链表的倒数第N个节点 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode left1 = prehead;
        while (head != null){
            if (n > 0){
                n--;
            }else {
                left1 = left1.next;
            }
            if (head.next == null && n <= 0 ){
                left1.next = left1.next.next;
            }
            head = head.next;
        }
        return prehead.next;
    }
}
