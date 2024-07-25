import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points , (a,b) -> Integer.compare(a[1],b[1]));
        int end=points[0][1],arrow=1;
        for(int i=1;i<points.length;i++){
            if(end<points[i][0]){
                arrow++;
                end=points[i][1];
            }
        }
        return arrow;
    }
}

// class Solution {
//     public int findMinArrowShots(int[][] points) {
//         Arrays.sort(points , (a,b) -> Integer.compare(a[0],b[0]));
//         int end=points[0][1],arrow=1;
//         for(int i=1;i<points.length;i++){
//             if(end<points[i][0]){
//                 arrow++;
//                 end=points[i][1];
//             }
//             else{
//                 end=Math.min(end,points[i][1]);
//             }
//         }
//         return arrow;
//     }
// }