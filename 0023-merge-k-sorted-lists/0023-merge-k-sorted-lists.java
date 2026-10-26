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
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k == 0){
            return null;
        }
        if(k == 1){
            return lists[0];
        }
        ListNode l1 = lists[0];
        ListNode l2 = lists[1];
        for(int i = 1; i < k; i++){
            l2 = lists[i];
            l1 = merge(l1, l2);
        }
        return l1;
    }
    private ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode trav1 = l1;
        ListNode trav2 = l2;
        ListNode head = null;
        if(trav1.val < trav2.val){
            head = trav1;
            trav1 = trav1.next;
        }
        else{
            head = trav2;
            trav2 = trav2.next;
        }
        ListNode trav = head;
        while(trav1 != null || trav2 != null){
            if(trav1 == null){
                trav.next = trav2;
                trav2 = trav2.next;
                trav = trav.next;
                continue;
            }
            if(trav2 == null){
                trav.next = trav1;
                trav1 = trav1.next;
                trav = trav.next;
                continue;
            }
            if(trav1.val < trav2.val){
                trav.next = trav1;
                trav1 = trav1.next;
                trav = trav.next;
            }
            else{
                trav.next = trav2;
                trav2 = trav2.next;
                trav = trav.next;
            }
        }
        return head;
    }
}