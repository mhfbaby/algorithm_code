package LeetCode;

public class $203移除链表元素 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode listNode;
        while (head !=null && head.val == val){
            head = head.next;
        }
        if (head == null){
            return head;
        }
        listNode = head;
        ListNode next = head.next;
        while (head.next != null){
            if (next.val == val){
                head.next = next.next;
            }else {
                head = next;
            }
            next = head.next;
        }
        return listNode;
    }
}

