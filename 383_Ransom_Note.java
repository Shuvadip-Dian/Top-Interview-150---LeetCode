class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character,Integer> map= new HashMap<>();
//         for(int i=0;i<magazine.length();i++){
//             map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
//         }
//         for(int i=0;i<ransomNote.length();i++){
//             if(!map.containsKey(ransomNote.charAt(i)) || map.get(ransomNote.charAt(i)) < 1){
//                 return false; 
//             }else{
//                 map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
//             }
//         }
//         return true;
//     }
// }