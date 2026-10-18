/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode trav1 = headA;
        ListNode trav2 = headB;
        while(trav1 != trav2){
            trav1 = trav1.next;
            trav2 = trav2.next;
            if(trav1 == trav2){
                return trav1; //return trav2 also correct
            }
            if(trav1 == null){
                trav1 = headB;
            }
            if(trav2 == null){
                trav2 = headA;
            }
        }
        return trav1;
    }
}