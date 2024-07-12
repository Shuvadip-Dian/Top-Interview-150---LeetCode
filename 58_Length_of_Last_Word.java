class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}

// class Solution {
//     public int lengthOfLastWord(String s) {
//         if (s == null || s.length() == 0) return 0;
//         int result = 0, i = s.length() - 1;
//         while (i >= 0 && s.charAt(i) == ' ') i--;   // Skip all whitespaces at the end of s.
//         while (i >= 0 && s.charAt(i) != ' ') {      // Count the number of consecutive non-whitespace characters.
//             result++;
//             i--;
//         }
//         return result;
//     }
// }

// class Solution {
//     public int lengthOfLastWord(String s) {
//         int length = 0;
//         for (int i = s.length() - 1; i >= 0; i--) {
//             if (s.charAt(i) != ' ') {
//                 length++;
//             } else {
//                 if (length > 0) return length; //instade of this condition we use counting is true or false condition
//             }
//         }
//         return length;
//     }
// }

// class Solution {
//     public int lengthOfLastWord(String s) {

//         int first = 0;
//         for(int i = s.length()-1 ; i>0;i--){
//             if(s.charAt(i)!=' ' && s.charAt(i-1) == ' ' ){
//                 first = i;
//                 break;
//             }
//         }
//         String temp  = s.substring(first).trim();
//         return temp.length();
//     }
// }