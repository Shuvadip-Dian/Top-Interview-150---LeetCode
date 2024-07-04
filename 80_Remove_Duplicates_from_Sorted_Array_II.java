class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        for(int i=2;i<=nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
            if(nums[i]==nums[i-1] && nums[i]!=nums[i-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k-1;
    }
}