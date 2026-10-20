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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null && list2 != null){
            return list2;
        }
        if(list1 != null && list2 == null){
            return list1;
        }
        ListNode trav1 = list1;
        ListNode trav2 = list2;
        ListNode head = trav1.val < trav2.val ? trav1 : trav2;
        ListNode trav = head;
        if(trav == trav1){
            trav1 = trav1.next;
        }
        else{
            trav2 = trav2.next;
        }
        while(trav != null){
            if(trav1 == null && trav2 == null){
                break;
            }
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