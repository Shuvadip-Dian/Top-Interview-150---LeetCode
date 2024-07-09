class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int totalCandies=0;
        int[] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i]=1;
        }
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]= candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                if(candies[i]<=candies[i+1])
                {
                    candies[i]=candies[i+1]+1;
                }
                
            }
        }
        for(int i=0;i<n;i++){
            totalCandies=totalCandies+candies[i];
        }
        return totalCandies;
    }
}

// class Solution {
//     public int candy(int[] ratings) {
//         int n= ratings.length;
//         if(n==0) return 0;
//         int totalCandies=n,peek=0,diff=0;
//         for(int i=0;i<n-1;i++){
//             if(ratings[i]<ratings[i+1]){
//                 peek++;
//                 totalCandies+=peek;
//             }
//             else if(ratings[i]==ratings[i+1]){
//                 peek=0;
//                 diff=0;
//             }
//             else{
//                 diff++;
//                 totalCandies+=diff;
//                 if(peek>=diff){
//                     totalCandies-=diff;
//                 }
//                 //totalCandies = totalCandies-Math.min(peek,diff);
//             }
            
//         }
//         return totalCandies;
//     }
// }

// class Solution {
//     public int candy(int[] ratings) {
//         int n= ratings.length;
//         if(n==0) return 0;
//         int totalCandies=1,up=0,peek=0,diff=0;
//         for(int i=0;i<n-1;i++){
//             if(ratings[i]<ratings[i+1]){
//                 diff=0;
//                 up++;
//                 peek=up;
//                 totalCandies+=1+up;
//             }
//             else if(ratings[i]==ratings[i+1]){
//                 peek=0;
//                 diff=0;
//                 up=0;
//                 totalCandies+=1;
//             }
//             else{
//                 up=0;
//                 diff++;
//                 totalCandies+=1+diff;
//                 if(peek>=diff){
//                     totalCandies--;
//                 }
//             }
            
//         }
//         return totalCandies;
//     }
// }