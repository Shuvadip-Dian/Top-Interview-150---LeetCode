class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast != null && fast.next !=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         if(head==null || head.next==null) return false;
//         if(head.next==head) return true;
//         ListNode nextnode= head.next;
//         head.next=head;
//         boolean isCycle = hasCycle(nextnode);
//         return isCycle;
//     }
// }

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         while (head != null) {
//             if (head.val == 1_000_000) return true;
//             head.val = 1_000_000;
//             head = head.next;
//         }
//         return false;
//     }
// }