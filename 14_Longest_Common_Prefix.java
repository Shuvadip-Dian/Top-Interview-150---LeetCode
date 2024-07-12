import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}

// class Solution {
//      public String longestCommonPrefix(String[] strs) {
//          Arrays.sort(strs);
//          String first=strs[0],last=strs[strs.length-1],prefix="";
//          int min = Math.min(first.length(),last.length());
//          for(int i=0;i<min;i++){
//              if(first.charAt(i)!=last.charAt(i)) return prefix;
//              else{
//                  prefix+=first.charAt(i);
//              } 
//          }
//          return prefix;
//      }
// }


// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String prefix=strs[0];
//         for(int i=1;i<strs.length;i++){
//             String s1=strs[i];
//             String temp ="";
//             int n= Math.min(s1.length(),prefix.length());
//             for(int j=0;j<n;j++){
//                 if(s1.charAt(j)==prefix.charAt(j)){
//                     temp+=s1.charAt(j);
//                 }else{
//                     break;
//                 }
//             }
//             prefix=temp;
//         }
//         return prefix;
//     }
// }

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) return "";
//         String prefix = strs[0];
//         for (String s : strs)
//             while (s.indexOf(prefix) != 0)
//                 prefix = prefix.substring(0, prefix.length() - 1);
//         return prefix;
//     }
// }