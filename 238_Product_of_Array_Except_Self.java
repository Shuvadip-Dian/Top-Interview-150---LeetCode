// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n= nums.length,product=1,count=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==0){
//                 count++;
//                 continue;
//             }
//             product=product*nums[i];
//         }
//         int[] answer= new int[n];
//         for(int i=0;i<n;i++){
//             if(nums[i]==0){
//                 count--;
//                 if(count>0){
//                     answer[i]=0;
//                     count++;
//                 }
//                 else{
//                     answer[i]=product;
//                     count++;
//                 }
//             }
//             else{
//                 if(count>0){
//                    answer[i]=0; 
//                 }
//                 else{
//                     answer[i]=product/nums[i];
//                 }
                
//             }
            
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[numsLength];
        for(int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
}
