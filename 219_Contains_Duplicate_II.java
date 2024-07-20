// Appraach:-1 Hashset

import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k == 0) return false;
        int i = 0;
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int j = 0; j < nums.length; j++) {
            if(!hset.add(nums[j])){
                return true;
            }
            if(hset.size() >= k+1){
                hset.remove(nums[i++]);
            }
        }
        return false;
    }
}

// Appraach:-2 HashMap
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         if (k == 0) return false;
//         Map<Integer, Integer> hashMap = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             int integer = nums[i];
//             if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k) {
//                 return true;
//             }
//             hashMap.put(integer, i);
//         }
//         return false;
//     }
// }

//map.put() returns the previous value associated with key, or null if there was no mapping for key.
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<Integer, Integer>();	
// 	    for(int i = 0; i <  nums.length; i++) {
// 		    Integer ord = map.put(nums[i], i);
// 		    if(ord != null && i - ord <= k) {
// 			    return true;
// 		    }
// 	    }	
// 	    return false;
//     }
// }