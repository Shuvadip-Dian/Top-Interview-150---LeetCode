import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);       
    }
}


// class Solution {
//     public int[][] merge(int[][] intervals) {
//         int n=intervals.length;
//         if(n==1) return intervals;
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         int[][] newArray = new int[n][2];
//         int start=intervals[0][0],end=intervals[0][1];
//         int a=0;
//         int count=0;
//         for(int i=1;i<n;i++){
//             int temp1=intervals[i][0];
//             int temp2= intervals[i][1];
//             if(temp1<=end){
//                 if(temp1<start){
//                     start=intervals[i][0];
//                 }
//                 if(temp2>end){
//                     end=intervals[i][1];
//                 }
//                 count++;
//                 if(i==n-1){
//                     newArray[a][0]=start;
//                     newArray[a][1]=end;
//                 }
//             }
//             else{
//                 newArray[a][0]=start;
//                 newArray[a][1]=end;
//                 a++;
//                 start=intervals[i][0];
//                 end=intervals[i][1];
//                 if(i==n-1){
//                     newArray[a][0]=start;
//                     newArray[a][1]=end;
//                 }
//             }
//         }
//         int[][] ans = new int[n-count][2];
//         for(int i=0;i<n-count;i++){
//             ans[i][0]=newArray[i][0];
//             ans[i][1]=newArray[i][1];
//         }
//         return ans;
//     }
// }