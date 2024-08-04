class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode dummy1 = new ListNode(0);
        ListNode fast=dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode slow=dummy2;
        while(temp!=null){
            if(temp.val<x){
                 fast.next=temp;
                 fast=temp;
            }else{
             slow.next=temp;
                slow=temp;
            }
            temp=temp.next;
        }
        fast.next=dummy2.next;
        slow.next=null;
        return dummy1.next;
    }
}