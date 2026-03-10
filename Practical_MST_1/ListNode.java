/**
 * Leetcode 86
 * partitions list
 */

//   Definition for singly-linked list.
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode partition(ListNode head, int x) {
        ListNode ld = new ListNode(0);
        ListNode gd = new ListNode(0);

        ListNode l = ld;
        ListNode g = gd;

        while (head != null) {
            if (head.val < x) {
                l.next = head;
                l = l.next;
            } else {
                g.next = head;
                g = g.next;
            }
            head = head.next;
        }

        g.next = null;
        l.next = gd.next;

        return ld.next;
    }
}
