class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,temp=0,min=0,max=0;
        while(i<j){
            min = Math.min(height[i],height[j]);
            temp = (j-i)*min;
            if(temp>max){
                max=temp;
            }
            temp=0;
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}

// class Solution {
//     public int maxArea(int[] H) {
//         int ans = 0, i = 0, j = H.length-1, res = 0;
//         while (i < j) {
//             if (H[i] <= H[j]) {
//                 res = H[i] * (j - i);
//                 i++;
//             } else {
//                 res = H[j] * (j - i);
//                 j--;
//             }
//             if (res > ans) ans = res;
//         }
//         return ans;
//     }
// }