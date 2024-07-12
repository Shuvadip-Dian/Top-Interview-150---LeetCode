class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[height.length - 1];
        int water = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
            } else {
                right--;
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
            }
        }
        return water;
    }
}

// class Solution {
//     public int trap(int[] height) {
//         int n= height.length;
//         int[] left=new int[n];
//         int[] right= new int[n];
//         int rain=0;
//         left[0]=height[0];
//         for(int i=1;i<n;i++){
//             if(height[i]>left[i-1]){
//                 left[i]=height[i];
//             }
//             else{
//                 left[i]=left[i-1];
//             }
//         }
//         right[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             if(height[i]>right[i+1]){
//                 right[i]=height[i];
//             }
//             else{
//                 right[i]=right[i+1];
//             }
//         }
//         for(int i=0;i<n;i++){
//             rain+= Math.min(left[i],right[i]) - height[i];
//         }
//         return rain;
//     }
// }

// public class Solution {
//     public int trap(int[] h) {
//         int l = 0, r = h.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
//         while (l < r) {
//         lmax = Math.max(lmax, h[l]);
//         rmax = Math.max(rmax, h[r]);
//         ans += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
//         }
//         return ans;
//     }
// }
