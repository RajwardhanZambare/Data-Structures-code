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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){ // 0 node
            return null;
        }
        if(head.next == null){ // 1 node
            return head;
        }

        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        k = k % length;
        if(k == 0){
            return head;
        }
        tail.next = head;
        ListNode newTail = findNthNode(head, length - k - 1);
        head = newTail.next;
        newTail.next = null;
        return head;
    }
    private ListNode findNthNode(ListNode temp, int n){
        for(int i = 0; i < n; i++){
            temp = temp.next;
        }
        return temp;
    }
}