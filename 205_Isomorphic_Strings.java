class Solution {
    public boolean isIsomorphic(String s, String t) {

        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
}


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         HashMap<Character, Character> map = new HashMap<>();
//         HashMap<Character, Character> reverseMap = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char charS = s.charAt(i);
//             char charT = t.charAt(i);  
//             if (map.containsKey(charS)) {
//                 if (map.get(charS) != charT) {
//                     return false;
//                 }
//             } else {
//                 if (reverseMap.containsKey(charT)) {
//                     return false;
//                 }
//                 map.put(charS, charT);
//                 reverseMap.put(charT, charS);
//             }
//         }
        
//         return true;
//     }
// }


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         Map<Character,Character>mapst = new HashMap<>();
//         Map<Character,Character>mapts = new HashMap<>();
//         for(int i =0;i<s.length();i++){
//             char chs = s.charAt(i);
//             char cht = t.charAt(i);
//             if(mapst.containsKey(chs) && mapst.get(chs)!=cht ||mapts.containsKey(cht) && mapts.get(cht)!=chs)
//                 return false;
//             mapst.put(chs,cht);
//             mapts.put(cht,chs);
//         }
//         return true;
//     }
// }