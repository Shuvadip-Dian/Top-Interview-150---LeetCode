class Solution {
    public boolean isSubsequence(String s, String t) {
    int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();
    if(m<1)
        return true;
    while(i<n){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;  
        if(j==m)
            return true;
        }
        return false;
    }
}


// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         if(s.length()>t.length()) return false;
//         if(s.length()==0) return true;
//         int j=0;
//         for(int i=0;i<t.length();i++){
//             if(t.charAt(i)==s.charAt(j)){
//                 j++;
//             }
//             if(j>=s.length()) return true;
//         }
//         return false;
//     }
// }

// public class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int i = 0, j = 0;
//         while (i < s.length() && j < t.length()) {
//             if (s.charAt(i) == t.charAt(j)) {
//                 i++;
//             }
//             j++;
//         }
//         return i == s.length();
//     }
// }