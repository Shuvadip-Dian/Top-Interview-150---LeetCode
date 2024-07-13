class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         String newstr="",palindom="";
//         for(int i=0;i<s.length();i++){
//             if(Character.isLetterOrDigit(s.charAt(i))){
//                 newstr+=s.charAt(i);
//             }
//         }
//         String s2=newstr.toLowerCase();
//         for(int i=newstr.length()-1;i>=0;i--){
//             palindom+=s2.charAt(i);
//         }
//         return s2.equals(palindom);
//     }
// }

// public class Solution {
//     public boolean isPalindrome(String s) {
//         String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//         String rev = new StringBuffer(actual).reverse().toString();
//         return actual.equals(rev);
//     }
// }