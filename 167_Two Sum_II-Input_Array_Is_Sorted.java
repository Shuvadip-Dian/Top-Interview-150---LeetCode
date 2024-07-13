class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l1=0,r1=numbers.length-1,sum=0;
        int[] ans=new int[2];
        while(l1<r1){
            sum=numbers[l1]+numbers[r1];
            if(sum==target){
                ans[0]=l1+1;
                ans[1]=r1+1;
                return ans;
            }
            else if(sum>target){
                r1--;
            }
            else{
                l1++;
            }
        }
        return ans;
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
// 	    int l = 0, r = nums.length - 1;
	
// 	    while (nums[l] + nums[r] != target) {
// 		    if (nums[l] + nums[r] < target) l++;
// 		    else r--;
// 	    }

// 	    return new int[] {l+1, r+1};
//     }
// }


// class Solution {
//     public static int[] twoSum(int[] numbers, int target) {
//         int len = numbers.length;
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < len; i++) {
//             if (map.containsKey(target - numbers[i])) {
//                 return new int[]{map.get(target - numbers[i]), i + 1};
//             }

//             map.putIfAbsent(numbers[i], i + 1);
//         }

//         return new int[0];
//     }
// }