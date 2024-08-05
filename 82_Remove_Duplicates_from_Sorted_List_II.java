class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy= new ListNode(-101);
        ListNode res=dummy;
        ListNode temp=head;
        ListNode prev=dummy;
        while(temp.next!=null){
            if(temp.val!=temp.next.val && temp.val!=prev.val ){
                res.next=temp;
                res=temp;
            }
            prev=temp;
            temp=temp.next;
        }
        if(temp.val!=prev.val){
            res.next=temp;
            res=temp;
        }
        res.next=null;
        return dummy.next;
    }
}

// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode dummy = new ListNode(0), fast = head, slow = dummy;
//         slow.next = fast;
//         while(fast != null) {
//     	    while (fast.next != null && fast.val == fast.next.val) {
//      		    fast = fast.next; 
//     	    }
//     	    if (slow.next != fast) {
//     		    slow.next = fast.next;
//     		    fast = slow.next;
//     	    } else {
//     		    slow = slow.next;
//     		    fast = fast.next;
//     	    }
//         }
//         return dummy.next;
//     } 
// }

// class Solution{
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head == null || head.next == null)return head;    
//         if(head.val != head.next.val){
//             head.next = deleteDuplicates(head.next);
//             return head;
//         }       
//         while(head.next != null && head.val == head.next.val){
//             head = head.next;
//         }      
//         return deleteDuplicates(head.next);
//     }
// }