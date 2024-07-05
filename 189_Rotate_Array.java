class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newarr = new int[n];
        for(int i=0;i<=n-1;i++){
            newarr[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=newarr[i];
        }
    }
}

// class Solution{
//     void rotateArray(int[] nums,int i,int j){
//         int l1=i;
//         int r1=j;
//         while(l1<r1){
//             int temp = nums[l1];
//             nums[l1] = nums[r1];
//             nums[r1] = temp;
//             l1++;
//             r1--;
//         }
//     }
//     public void rotate(int[] nums, int k){
//         int n = nums.length;
//         k = k % nums.length;
//         if(k<0){
//             k+=n;
//         }
//         rotateArray(nums,0,n-k-1);
//         rotateArray(nums,n-k,n-1);
//         rotateArray(nums,0,n-1);
//     }
// }