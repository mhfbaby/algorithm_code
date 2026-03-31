package LeetCode;

public class $707设计链表 {

    public static void main(String[] args) {

    }

}

class MyLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val , ListNode next){
            this.val = val;
            this.next = next;
        }
        ListNode(int val){
            this.val = val;
        }
    }
    MyLinkedList myLinkedList;

    //虚拟头节点
    ListNode head;
    public MyLinkedList() {
        this.head = new ListNode(0);
    }


    public int get(int index) {
        if (index < 0){
            return -1;
        }
        ListNode cur = head;
        for (int i = 0 ; i <= index ; i++){
            cur = cur.next;
            if (cur == null){
                return -1;
            }
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode listNode = new ListNode(val);
        listNode.next = head.next;
        head.next = listNode;
    }

    public void addAtTail(int val) {
        ListNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        ListNode listNode = new ListNode(val);
        cur.next = listNode;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0){
            return ;
        }
        ListNode cur = head;
        for (int i = 0 ; i < index ; i++){
            cur = cur.next;
            if (cur == null){
                return ;
            }
        }
        ListNode listNode = new ListNode(val);
        listNode.next = cur.next;
        cur.next = listNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0){
            return ;
        }
        ListNode cur = head;
        for (int i = 0 ; i < index ; i++){
            cur = cur.next;
            if (cur == null){
                return ;
            }
        }
        if (cur.next != null){
            cur.next = cur.next.next;
        }


    }
}
