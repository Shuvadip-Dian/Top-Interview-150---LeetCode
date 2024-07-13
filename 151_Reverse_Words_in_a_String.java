class Solution {
    public String reverseWords(String s) {
      if (s == null) return null;
      char[] a = s.toCharArray();
      int n = a.length;
      reverse(a, 0, n - 1);
      reverseWords(a, n);
      return cleanSpaces(a, n);
    }
    
    void reverseWords(char[] a, int n) {
      int i = 0, j = 0; 
      while (i < n) {
        while (i < j || i < n && a[i] == ' ') i++;
        while (j < i || j < n && a[j] != ' ') j++;
        reverse(a, i, j - 1);
      }
    }
    
    // trim leading, trailing and multiple spaces
    String cleanSpaces(char[] a, int n) {
      int i = 0, j = 0;
        while (j < n) {
          while (j < n && a[j] == ' ') j++;
          while (j < n && a[j] != ' ') a[i++] = a[j++];
          while (j < n && a[j] == ' ') j++;
          if (j < n) a[i++] = ' ';
      }
      return new String(a).substring(0, i);
    }
    
    private void reverse(char[] a, int i, int j) {
      while (i < j) {
        char t = a[i];
        a[i++] = a[j];
        a[j--] = t;
      }
    }
  }
  
  
  // class Solution {
  //     public String reverseWords(String s) {
  //         String str=s.trim(),newstr="",temp="";
  //         Boolean backspace = false;
  //         for(int i=str.length()-1;i>=0;i--){
  //             if(str.charAt(i)!=' '){
  //                 backspace = false;
  //                 String subString= temp;
  //                 temp=Character.toString(str.charAt(i));
  //                 temp+=subString;
  //                 if(i==0) return newstr+temp;
  //             }
  //             else{
  //                 if(!backspace){
  //                     backspace= true;
  //                     newstr+=temp;
  //                     newstr+=" ";
  //                     temp="";
  //                 }
  //             }  
  //         }
  //         return newstr;
  //     }
  // }
  
  // class Solution {
  //      public String reverseWords(String s) {
  //         Stack<String> st = new Stack<String>();
  //         for (String a : s.trim().split(" ")) {
  //             if (!a.isEmpty())
  //                 st.push(a);
  //         }
          
  //         StringBuilder sb = new StringBuilder();
  //         while (!st.isEmpty()) {
  //             sb.append(st.pop());
  //             sb.append(" ");            
  //         }
  //         return sb.toString().trim();
  //     }
  // }
  
  // class Solution {
  //     public String reverseWords(String s) {
  //         // split("\\s+") will split the string into string of array with separator as space or multiple spaces.
  //         String[] str = s.trim().split("\\s+");
  //         String out = "";
  //         for (int i = str.length - 1; i > 0; i--) {
  //             out += str[i] + " ";
  //         }
  //         return out + str[0];
  //     }
  // }
  
  // public class Solution {
  //     public String reverseWords(String s) {
  //         String [] words = s.split(" ");
  //         StringBuilder sb = new StringBuilder();
  //         int end = words.length - 1;
  //         for(int i = 0; i<= end; i++){
  //             if(!words[i].isEmpty()) {
  //                 sb.insert(0, words[i]);
  //                 if(i < end) sb.insert(0, " ");
  //             }
  //         }
  //         return sb.toString();
  //     }
  // }