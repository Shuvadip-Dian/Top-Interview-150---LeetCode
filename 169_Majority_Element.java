import java.util.Arrays;

class Solution{
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }
}




// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> hash = new HashMap<>();
//         int res = 0;
//         int m= nums.length;
//         int majority = m/2;

//         for (int n : nums) {
//             hash.put(n, 1 + hash.getOrDefault(n, 0));
//             if (hash.get(n) > majority) {
//                 res = n;
//                 //majority = hash.get(n);
//             }
//         }

//         return res;        
//     }
// }


// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < n; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
        
//         n = n / 2;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > n) {
//                 return entry.getKey();
//             }
//         }
        
//         return 0;
//     }
// }