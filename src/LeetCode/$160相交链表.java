package LeetCode;

public class $160相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode preHeadA = headA;
        ListNode preHeadB = headB;

        while (preHeadA != null){
            lenA++;
            preHeadA = preHeadA.next;
        }

        while (preHeadB != null){
            lenB++;
            preHeadB = preHeadB.next;
        }
        preHeadA = headA;
        preHeadB = headB;

        if (lenA < lenB){
            int tmp = lenA;
            lenA = lenB;
            lenB = tmp;
            ListNode listNode = headA;
            preHeadA = headB;
            preHeadB = listNode;
        }
        int gap = lenA - lenB;
        while (gap-- > 0){
            preHeadA = preHeadA.next;
        }
        while (preHeadA != null){
            if (preHeadA == preHeadB){
                return preHeadA;
            }
            preHeadB = preHeadB.next;
            preHeadA = preHeadA.next;
        }

        return null;
    }
}
