class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         int hLen = haystack.length();
//         int nLen = needle.length();
//         int nIndex = 0;
//         for(int i=0; i<hLen; i++){
//             if(haystack.charAt(i)==needle.charAt(nIndex)){
//                 nIndex++;
//             }
//             else{
//                 i=i-nIndex;
//                 nIndex=0;
//             }
//             if(nIndex==nLen){
//                 return i-nLen+1;
//             }
//         }
//         return -1;
//     }
// }


// class Solution {
//     public int strStr(String haystack, String needle) {
//         // empty needle appears everywhere, first appears at 0 index
//         if (needle.length() == 0)
//             return 0;
//         if (haystack.length() == 0)
//             return -1;
//         for (int i = 0; i < haystack.length(); i++) {
//             if (i + needle.length() > haystack.length()) break;
            
//             for (int j = 0; j < needle.length(); j++) {
//                 if (haystack.charAt(i+j) != needle.charAt(j))
//                     break;
//                 if (j == needle.length()-1)
//                     return i;
//             }
//         }       
//         return -1;
//     }
// }

//same approach as last one only difference is using while loop
// class Solution {
//     public int strStr(String haystack, String needle) {
//         int haylength=haystack.length();
//         int needlelength=needle.length();
//         if(haylength<needlelength)
//             return -1;
//         for(int i=0;i<=haystack.length()-needle.length();i++){
//             int j=0;
//             while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
//                 j++;
//             if(j==needle.length()){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }