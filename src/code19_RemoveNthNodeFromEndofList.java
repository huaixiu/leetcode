
/*给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。*/

public class code19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
/**
 * diary:easy
 */