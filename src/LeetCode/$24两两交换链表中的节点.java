package LeetCode;

public class $24两两交换链表中的节点 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode cur = prehead;
        while (cur.next != null && cur.next.next!= null){
            ListNode temNode1 = cur.next;
            ListNode temNode2 = cur.next.next.next;

            cur.next = cur.next.next;
            cur.next.next = temNode1;
            temNode1.next = temNode2;

            cur = temNode1;
        }
        return prehead.next;

    }
}
