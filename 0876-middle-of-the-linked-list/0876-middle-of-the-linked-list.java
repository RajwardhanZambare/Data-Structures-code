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
    public ListNode middleNode(ListNode head) {
        if(head.next == null){
            return head;
        }
        if(head.next.next == null || head.next.next.next == null){
            return head.next;
        }
        int length = calculateLength(head);
        if(length % 2 != 0){
            length = (length + 1) / 2;
        }
        else{
            length = (length / 2) + 1;
        }
        ListNode trav = head;
        for(int i = 1; i < length; i++){
            trav = trav.next;
        }
        return trav;
    }
    public int calculateLength(ListNode head){
        ListNode trav = head;
        int count = 0;
        while(trav != null){
            count++;
            trav = trav.next;
        }
        return count;
    }
}