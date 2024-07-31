class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; 
        int carry = 0;  
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; 
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){ 
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; 
            carry = sum/10; 
            ListNode node = new ListNode(sum % 10);
            curr.next = node; 
            curr = curr.next; 
        }
        return dummy.next;
    }
}


// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode ansHead = null;
//         ListNode ansTail = null;
//         int  num = 0, carry = 0;
//         while(l1 != null && l2 != null){
//             num = (l1.val + l2.val + carry) % 10;
//             if(ansHead == null && ansTail == null){
//                 ansHead = ansTail = new ListNode(num);
//             }
//             else{
//                 ansTail.next = new ListNode(num);
//                 ansTail = ansTail.next;
//             }
//             carry = (l1.val + l2.val + carry) / 10;

//             l1 = l1.next;
//             l2 = l2.next;
//         }
//         while(l1 != null){
//             num = (l1.val + carry) % 10;
//             ansTail.next = new ListNode(num);
//             carry = (l1.val + carry) / 10;
//             ansTail = ansTail.next;
//             l1 = l1.next;
//         }
//         while(l2 != null){
//             num = (l2.val + carry) % 10;
//             ansTail.next = new ListNode(num);
//             carry = (l2.val + carry) / 10;
//             ansTail = ansTail.next;
//             l2 = l2.next;
//         }
//         if(carry != 0){
//             ansTail.next = new ListNode(carry);
//             ansTail = ansTail.next;
//         }
//         return ansHead;
//     }
// }