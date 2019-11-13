/*给出两个非空的链表用来表示两个非负的整数。
  其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
  如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
  您可以假设除了数字 0 之外，这两个数都不会以 0 开头。*/
public class code2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int carry = 0;
        ListNode p = l1,q = l2, curr =result;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return result.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}

/**
 * 随笔：首先这个数是逆序的要看清楚，所以只要按序相加十位进一就行
 * 主要需要注意的是listnode的用法，尽量使用两个listnode，因为返回是一件很麻烦的事情
 * 同时要警惕边界条件，当一个数用完一个数还没有的时候是很常见的
 */
