class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] newArray = new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>=n){
                newArray[n]++;
            }
            else{
                newArray[citations[i]]++;
            }
        }
        int hindex=0;
        for(int i=n;i>=0;i--){
            hindex=hindex+newArray[i];
            if(hindex>= i){
                return i;
            } 
        }
        return 0;
    }
}


// public int hIndex(int[] citations) {
//     int n = citations.length;
//     int[] buckets = new int[n+1];
//     for(int c : citations) {
//         if(c >= n) {
//             buckets[n]++;
//         } else {
//             buckets[c]++;
//         }
//     }
//     int count = 0;
//     for(int i = n; i >= 0; i--) {
//         count += buckets[i];
//         if(count >= i) {
//             return i;
//         }
//     }
//     return 0;
// }