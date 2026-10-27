/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        //1]insert copyNodes in between
        Node temp = head;
        while(temp != null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }

        //2]connect random pointers
        temp = head;
        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        //3]connect next pointers
        temp = head;
        Node resultHead = head.next;
        while(temp != null){
            Node copyNode = temp.next;
            temp.next = copyNode.next;
            if(copyNode.next != null){
                copyNode.next = copyNode.next.next;
            }
            temp = temp.next;
        }

        return resultHead;
    }
}