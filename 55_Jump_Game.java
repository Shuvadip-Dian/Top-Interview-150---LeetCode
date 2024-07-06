// class Solution {
//     public boolean canJump(int[] nums) {
//         int n=nums.length,maxReach=0;
//         for(int i=0;i<=n-1;i++){
//             if(maxReach>=n-1){
//                 return true;
//             }
//             if(maxReach<i) return false;
//             maxReach=Math.max(maxReach,i+nums[i]);
            
//         }
//         return false;
//     }
// }

class Solution {
    public boolean canJump(int[] nums) {
        int goal= nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        return goal==0;
    }
}