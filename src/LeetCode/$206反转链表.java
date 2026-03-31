package LeetCode;

public class $206反转链表 {
    public static void main(String[] args) {

    }
    public ListNode reverseList2(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        if (head == null || head.next == null){
            return head;
        }

        ListNode cur = head;
        while (cur.next != null){
            ListNode listNode1 = cur.next;
            ListNode listNode2 = preHead.next;

            preHead.next = cur.next;
            cur.next = cur.next.next;
            listNode1.next = listNode2;

        }
        return preHead.next;
    }

































    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

