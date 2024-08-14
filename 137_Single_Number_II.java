class Solution {
    public int singleNumber(int[] nums) {
        int bucket1=0,bucket2=0;
        for(int i=0;i<nums.length;i++){
            bucket1=(bucket1^nums[i])& (~bucket2);
            bucket2=(bucket2^nums[i])& (~bucket1);
        }
        return bucket1;
    }
}

// class Solution {
//     public int singleNumber(int[] nums) {
//         Map<Integer,Integer> map= new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//         }
//         for(Map.Entry<Integer,Integer> It : map.entrySet()){
//             if(It.getValue()==1){
//                 return It.getKey();
//             }
//         }
//         return 0;
//     }
// }