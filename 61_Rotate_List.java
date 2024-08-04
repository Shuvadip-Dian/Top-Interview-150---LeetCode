class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution{
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = head;       
        if(head == null || head.next == null) return head;
        int n = 1;
        while(dummy.next!=null){
            dummy = dummy.next;
            n++;
        }
        dummy.next = head;
        dummy = head;
        k = k%n;   
        for(int i = 0;i<n-k-1;i++){
            dummy = dummy.next;
        }
        head = dummy.next;
        dummy.next = null;
        return head;
    }
}

// class Solution{
//     public ListNode rotateRight(ListNode head, int n) {
//         if (head==null||head.next==null) return head;
//         ListNode dummy=new ListNode(0);
//         dummy.next=head;
//         ListNode fast=dummy,slow=dummy;

//         int i;
//         for (i=0;fast.next!=null;i++)
//     	    fast=fast.next;
    
//         for (int j=i-n%i;j>0;j--)
//     	    slow=slow.next;
    
//         fast.next=dummy.next;
//         dummy.next=slow.next;
//         slow.next=null;
    
//         return dummy.next;
//     }
// }


// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head==null || head.next==null) return head;
//         int i=0;
//         ListNode temp1=head;
//         while(temp1!=null){
//             i++;
//             temp1=temp1.next;
//         }
//         if((k%i)==0){
//             return head;
//         }else{
//             k=k%i;
//         }
//         while(k>0){
//             ListNode temp = head;
//             ListNode prev=head;
//             while(temp.next!=null){
//                 prev=temp;
//                 temp=temp.next;
//             }
//             prev.next=null;
//             temp.next=head;
//             head=temp;
//             k--;
//         }
//         return head;
//     }
// }