class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];
        int i=0, j=0, k=0;
        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) new_arr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }
            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }
        if (n%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
        else return new_arr[n/2];
    }
}


// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         int i = 0, j = 0, m1 = 0, m2 = 0;
//         for (int count = 0; count <= (n + m) / 2; count++) {
//             m2 = m1;
//             if (i != n && j != m) {
//                 if (nums1[i] > nums2[j]) {
//                     m1 = nums2[j++];
//                 } else {
//                     m1 = nums1[i++];
//                 }
//             } else if (i < n) {
//                 m1 = nums1[i++];
//             } else {
//                 m1 = nums2[j++];
//             }
//         }
//         if ((n + m) % 2 == 1) {
//             return (double) m1;
//         } else {
//             double ans = (double) m1 + (double) m2;
//             return ans / 2.0;
//         }
//     }
// }