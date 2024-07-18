//Two-pass Hash Table
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maps = new HashMap<>();
        int temp=0;
        for(int i=0;i<nums.length;i++){
            maps.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            temp=target-nums[i];
            if(maps.containsKey(temp) && maps.get(temp)!=i){
                return new int[]{i,maps.get(temp)};
            }
        }
        return new int[]{};
    }
}

//One-pass Hash Table
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer,Integer> maps = new HashMap<>();
//         int temp=0;
//         for(int i=0;i<nums.length;i++){
//             temp=target-nums[i];
//             if(maps.containsKey(temp)){
//                 return new int[]{i,maps.get(temp)};
//             }
//             maps.put(nums[i],i);
//         }
//         return new int[]{};
//     }
// }