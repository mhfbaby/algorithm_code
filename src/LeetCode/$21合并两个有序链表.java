package LeetCode;

public class $21合并两个有序链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        System.out.println(mergeTwoLists(l1,l2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode ls = new ListNode(0);
        ListNode pre = ls;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                ls.next = list1;
                ls = ls.next;
                list1 = list1.next;
            }else {
                ls.next = list2;
                ls = ls.next;
                list2 = list2.next;
            }
        }
        if (list1 != null)
            ls.next = list1;
        if (list2 != null)
            ls.next = list2;
        return pre.next;
    }
}
