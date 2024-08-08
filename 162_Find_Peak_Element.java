class Solution{
    public int findPeakElement(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while(low < high) {
            mid = low + (high-low)/2;
            if(a[mid] < a[mid+1]) low = mid+1;
            else high = mid;
        }
        return low;
    }
}

// class Solution{
//     public int findPeakElement(int[] num) {    
//         return helper(num,0,num.length-1);
//     }

//     public int helper(int[] num,int start,int end){
//         if(start == end){
//             return start;
//         }else if(start+1 == end){
//             if(num[start] > num[end]) return start;
//             return end;
//         }else{
//             int m = (start+end)/2;
//             if(num[m] > num[m-1] && num[m] > num[m+1]){
//                 return m;
//             }else if(num[m-1] > num[m] && num[m] > num[m+1]){
//                 return helper(num,start,m-1);
//             }else{
//                 return helper(num,m+1,end);
//             }
//         }
//     }
// }