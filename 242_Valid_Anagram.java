import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);    
        return Arrays.equals(sChars, tChars);
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int[] count = new int[26];
//         for (char x : s.toCharArray()) {
//             count[x - 'a']++;
//         }
//         for (char x : t.toCharArray()) {
//             count[x - 'a']--;
//         }
//         for (int val : count) {
//             if (val != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         Map<Character, Integer> count = new HashMap<>();
//         for (char x : s.toCharArray()) {
//             count.put(x, count.getOrDefault(x, 0) + 1);
//         }
//         for (char x : t.toCharArray()) {
//             count.put(x, count.getOrDefault(x, 0) - 1);
//         }
//         for (int val : count.values()) {
//             if (val != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         Map<Character,Integer> maps = new HashMap<>();
//         if(s.length()!=t.length()) return false;
//         for(int i=0;i<s.length();i++){
//             maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0)+1);
//         }
//         for(int i=0;i<t.length();i++){
//             if(!maps.containsKey(t.charAt(i)) || maps.get(t.charAt(i)) < 1){
//                 return false;
//             }
//             maps.put(t.charAt(i),maps.get(t.charAt(i))-1);
//         }
//         return true;
//     }
// }