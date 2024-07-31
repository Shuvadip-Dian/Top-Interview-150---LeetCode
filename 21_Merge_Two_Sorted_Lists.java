class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;        
    }
}

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if (list1 == null || list2 == null) {
//             return (list1 != null) ? list1 : list2;
//         }

//         if (list1.val > list2.val) {
//             ListNode temp = list1;
//             list1 = list2;
//             list2 = temp;
//         }

//         list1.next = mergeTwoLists(list1.next, list2);
//         return list1;        
//     }
// }

// class Solution{
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2){
// 		if(l1 == null) return l2;
// 		if(l2 == null) return l1;
// 		if(l1.val < l2.val){
// 			l1.next = mergeTwoLists(l1.next, l2);
// 			return l1;
// 		} else{
// 			l2.next = mergeTwoLists(l1, l2.next);
// 			return l2;
// 		}
//     }
// }

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode list = new ListNode(0);
//         ListNode res =list;
//         while(list1 != null && list2 != null){
//             if(list1.val<=list2.val){
//                 ListNode node = new ListNode(list1.val);
//                 res.next= node;
//                 res=res.next;
//                 list1=list1.next;
//             }
//             else{
//                 ListNode node = new ListNode(list2.val);
//                 res.next= node;
//                 res=res.next;
//                 list2=list2.next;
//             }
//         }
//         while(list1 != null){
//             ListNode node = new ListNode(list1.val);
//             res.next=node;
//             res= res.next;
//             list1= list1.next;
//         }
//         while(list2 != null){
//             ListNode node = new ListNode(list2.val);
//             res.next=node;
//             res= res.next;
//             list2= list2.next;
//         }
//         return list.next;
//     }
// }