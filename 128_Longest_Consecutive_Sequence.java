//Approach:-1 HashSet

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            // look left
            int num = nums[i];
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }
            // look right
            num = nums[i];
            while (set.contains(++num)) {
                count++;
                set.remove(num);
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

//Approach:-2 HashMap

// public class Solution {
//     public int longestConsecutive(int[] num) {
//         int length = num.length;
//         if (length == 0 || length == 1) return length;  
//         Map<Integer, Integer> numMap = new HashMap<Integer, Integer>(); 
//         for (int i=0; i<length; i++) {
//             numMap.put(num[i], 1);
//         }
//         int maxLen = 0;
//         for (int i=0; i<length; i++) {
//             if (!numMap.containsKey(num[i])) {
//                 continue;
//             }
//             int max = 1;
//             int temp1 = num[i];
//             int temp2 = num[i];
//             while (numMap.containsKey(++temp1)) {
//                 max+=1;
//                 numMap.remove(temp1);
//             }
//             while(numMap.containsKey(--temp2)) {
//                 max+=1;
//                 numMap.remove(temp2);
//             }
//             numMap.remove(num[i]);
//             if (max>maxLen) {
//                 maxLen = max;
//             }
//         }
//         return maxLen;
//     }
// }

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Set<Integer> numSet = new HashSet<>();
//         for (int num : nums) {
//             numSet.add(num);
//         }
//         int longest = 0;
//         for (int num : nums) {
//             if (!numSet.contains(num - 1)) {
//                 int length = 1;
//                 while (numSet.contains(num + length)) {
//                     length++;
//                 }
//                 longest = Math.max(longest, length);
//             }
//         }
//         return longest;        
//     }
// }