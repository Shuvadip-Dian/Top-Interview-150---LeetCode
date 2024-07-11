class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1) return 0;
        int maxReach=nums[0],step=nums[0],count=1;
        for(int i=1;i<n;i++){
            if(i==n-1) return count;
            // if(i+nums[i]>maxReach){
            //     maxReach=i+nums[i];
            // }
            maxReach = Math.max(maxReach, i + nums[i]);
            step--;
            if(step==0){
                count++;
                step=maxReach-i;
            }
        }
        return count;
    }
}

// class Solution {
//   public int jump(int[] nums) {
//     int ans = 0;
//     int end = 0;
//     int farthest = 0;

//     // Implicit BFS
//     for (int i = 0; i < nums.length - 1; ++i) {
//       farthest = Math.max(farthest, i + nums[i]);
//       if (farthest >= nums.length - 1) {
//         ++ans;
//         break;
//       }
//       if (i == end) {   // Visited all the items on the current level
//         ++ans;          // Increment the level
//         end = farthest; // Make the queue size for the next level
//           // if( farthest >= nums.length-1){
//           //       return ans;
//           // }
//       }
//     }
//     return ans;
//   }
// }