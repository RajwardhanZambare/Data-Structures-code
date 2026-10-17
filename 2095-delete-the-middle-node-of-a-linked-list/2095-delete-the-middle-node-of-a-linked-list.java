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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        int middleNode = calculateMiddle(head); //by zero based indexing
        ListNode trav = head;
        for(int i = 0; i < middleNode - 1; i++){
            trav = trav.next;
        }
        trav.next = trav.next.next;
        return head;
    }
    public int calculateMiddle(ListNode head){
        ListNode trav = head;
        int count = 0;
        while(trav != null){
            count++;
            trav = trav.next;
        }
        return count / 2;
    }
}