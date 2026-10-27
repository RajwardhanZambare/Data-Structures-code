/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }
    private ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode head = null;
        if(l1.val < l2.val){
            head = l1;
            l1 = l1.next;
        }
        else{
            head = l2;
            l2 = l2.next;
        }
        ListNode trav = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
                trav.next = l2;
                l2 = l2.next;
                trav = trav.next;
                continue;
            }
            if(l2 == null){
                trav.next = l1;
                l1 = l1.next;
                trav = trav.next;
                continue;
            }
            if(l1.val < l2.val){
                trav.next = l1;
                l1 = l1.next;
                trav = trav.next;
            }
            else{
                trav.next = l2;
                l2 = l2.next;
                trav = trav.next;
            }
        }
        return head;
    }
}