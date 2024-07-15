import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;       
    }
}

//approch:2 using hashmap
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLength = 0;
//         Map<Character, Integer> charMap = new HashMap<>();
//         int left = 0;
        
//         for (int right = 0; right < n; right++) {
//             if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
//                 charMap.put(s.charAt(right), right);
//                 maxLength = Math.max(maxLength, right - left + 1);
//             } else {
//                 left = charMap.get(s.charAt(right)) + 1;
//                 charMap.put(s.charAt(right), right);
//             }
//         }
//         return maxLength;
//     }
// }

//approch:3 using hashmap
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int i=0,j=0,max=0,size=0;
//         String ele="";
//         Set<String> set=new HashSet<String>();
//         while(j<s.length()){
//             ele=Character.toString(s.charAt(j));
//             if(!set.contains(ele)){
//                 set.add(ele);
//                 j++;
//             }
//             else{
//                 size=set.size();
//                 max=Math.max(max,size);
//                 set.clear();
//                 i++;
//                 j=i;
//                 size=0;
//             }
//             ele="";
//         }
//         size=set.size();
//         max=Math.max(max,size);
//         return max;
//     }
// }

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         Map<Character, Integer> map = new HashMap<>();
//         int i = 0;
//         int j = 0;
//         int max = 0;
//         while(j < s.length()){
//             map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
//             if(map.size() == j - i + 1){
//                 max = Math.max(max, j - i + 1);
//                 j++;
//             }
//             else if(map.size() < j - i + 1){
//                 while(map.size() < j - i + 1){
//                     map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
//                     if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
//                     i++;
//                 }
//                 j++;
//             }
//         }
//         return max;
//     }
// }