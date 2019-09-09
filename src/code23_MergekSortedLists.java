
/*合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。*/

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class code23_MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        queue.addAll(Stream.of(lists).filter(Objects::nonNull).collect(Collectors.toList()));
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next = node;
            p = p.next;
            if (node.next != null)
                queue.add(node.next);
        }
        return dummy.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
