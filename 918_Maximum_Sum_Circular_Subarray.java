// one pass(optimal)
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0; 
        int minSubarraySum = Integer.MAX_VALUE, tempMinSum = 0;
        int maxSubarraySum = Integer.MIN_VALUE, tempMaxSum = 0;
        
        for (int n : nums) {
            totalSum += n;

            // normal kadane
            tempMaxSum += n;
            maxSubarraySum = Math.max(maxSubarraySum, tempMaxSum);
            if (tempMaxSum < 0) tempMaxSum = 0;

            // kadane (treating elements as signs inverted)
            tempMinSum += n;
            minSubarraySum = Math.min(minSubarraySum, tempMinSum);
            if (tempMinSum > 0) tempMinSum = 0;
        }

        if (totalSum == minSubarraySum) {   // all elements are negative
            return maxSubarraySum;
        }

        int maxCircularSubarraySum = totalSum - minSubarraySum;
        return Math.max(maxSubarraySum, maxCircularSubarraySum);
    }
}

// two pass
// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//         int maxSubarraySum = kadane(nums);
//         int totalSum = 0;
//         for (int i = 0; i < nums.length; i++) {
//             totalSum += nums[i];
//             nums[i] = -nums[i]; 
//         } 
//         int minSubarraySum = -kadane(nums);
//         if (totalSum == minSubarraySum) {
//             return maxSubarraySum;
//         }
//         int maxCircularSubarraySum = totalSum - minSubarraySum;
//         return Math.max(maxSubarraySum, maxCircularSubarraySum);
//     }
//     private int kadane(int[] a) {
//         int sum = 0, maxSum = Integer.MIN_VALUE;
//         for (int n : a) {
//             sum += n;
//             if (sum > maxSum) maxSum = sum;
//             if (sum < 0) sum = 0;
//         }
//         return maxSum;
//     }
// }