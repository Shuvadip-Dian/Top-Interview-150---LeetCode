class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        for(int i = 0; i < left - 1; i++)
            prev = prev.next;
        
        ListNode curr = prev.next;
        for(int i = 0; i < right - left; i++){
            ListNode forw = curr.next;
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        return dummy.next;
    }
}

// class Solution{
//     public ListNode reverseBetween(ListNode head, int m, int n) {
//         ListNode fakeHead = new ListNode(-1);
//         fakeHead.next = head;
//         ListNode prev = fakeHead;
//         ListNode curr = fakeHead.next;
//         int i = 1;
//         while (i < m) {
//             prev = curr;
//             curr = curr.next;
//             i++;
//         }
//         ListNode node = prev;
//         while (i <= n) {
//             ListNode tmp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = tmp;
//             i++;
//         }
//         node.next.next = curr;
//         node.next = prev;
//         return fakeHead.next;
//     }
// }