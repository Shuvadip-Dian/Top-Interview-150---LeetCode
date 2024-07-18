import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> maps=new HashMap<>();
        String words[] = s.split(" ");
        if (words.length != pattern.length()) return false;
        for(int i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(!maps.containsKey(c)){
                if (maps.containsValue(word)) return false;
                maps.put(c,word);
            }
            else if(!maps.get(c).equals(word)){
                    return false;
            }
        }
        return true;
    }
}


// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         String[] words = s.split(" ");
//         if (words.length != pattern.length()) return false;
//         Map<Character, String> charToWord = new HashMap<>();
//         Map<String, Character> wordToChar = new HashMap<>();
//         for (int i = 0; i < pattern.length(); i++) {
//             char c = pattern.charAt(i);
//             String word = words[i];
//             if (!charToWord.containsKey(c)) {
//                 charToWord.put(c, word);
//             }
//             if (!wordToChar.containsKey(word)) {
//                 wordToChar.put(word, c);
//             }
//             if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
//                 return false;
//             }
//         }
//         return true;        
//     }
// }