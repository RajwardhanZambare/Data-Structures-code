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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow1 = head;
        ListNode slow = findMiddle(fast, slow1);
        ListNode newHead = reverse(slow.next);
        ListNode oldHead = head;
        while(newHead != null && oldHead != null){
            if(oldHead.val != newHead.val){
                return false;
            }
            oldHead = oldHead.next;
            newHead = newHead.next;
        }
        ListNode originalList = reverse(newHead);
        return true;
    }
    public ListNode findMiddle(ListNode fast, ListNode slow){
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode temp){
        ListNode prev = null;
        ListNode front;
        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}