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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int length = calculateLength(head);
        if(length == n){
            return head.next;
        }
        ListNode trav = head;
        for(int i = 1; i < length - n; i++){
            trav = trav.next;
        }
        trav.next = trav.next.next;
        return head;
    }
    public int calculateLength(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}