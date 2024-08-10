// Binary Search (Two Binary Searches):
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }
}


// Modified Binary Search (Optimized):
// public class Solution {
// 	public int[] searchRange(int[] A, int target) {
// 		int start = Solution.firstGreaterEqual(A, target);
// 		if (start == A.length || A[start] != target) {
// 			return new int[]{-1, -1};
// 		}
// 		return new int[]{start, Solution.firstGreaterEqual(A, target + 1) - 1};
// 	}

// 	private static int firstGreaterEqual(int[] A, int target) {
// 		int low = 0, high = A.length;
// 		while (low < high) {
// 			int mid = low + ((high - low) >> 1);
// 			if (A[mid] < target) {
// 				low = mid + 1;
// 			} else {
// 				high = mid;
// 			}
// 		}
// 		return low;
// 	}
// }


// Two-Pointer Approach:
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;
//         int first = -1, last = -1;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) {
//                 first = mid;
//                 last = mid;
//                 while (first > 0 && nums[first - 1] == target) {
//                     first--;
//                 }
//                 while (last < nums.length - 1 && nums[last + 1] == target) {
//                     last++;
//                 }
//                 break;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return new int[]{first, last};
//     }
// }