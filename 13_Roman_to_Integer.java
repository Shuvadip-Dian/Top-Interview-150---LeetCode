class Solution {
    public int romanToInt(String s) {
  
      int answer = 0, number = 0, prev = 0;

      for (int j = s.length() - 1; j >= 0; j--) {
          switch (s.charAt(j)) {
              case 'M' -> number = 1000;
              case 'D' -> number = 500;
              case 'C' -> number = 100;
              case 'L' -> number = 50;
              case 'X' -> number = 10;
              case 'V' -> number = 5;
              case 'I' -> number = 1;
          }
          if (number < prev) {
              answer -= number;
          }
           else {
              answer += number;
          }
          prev = number;
      }
      return answer;
  }
}


// class Solution {
//     public int romanToInt(String s) {
//         Map<Character,Integer> m= new HashMap();
//         m.put('I',1);
//         m.put('V',5);
//         m.put('X',10);
//         m.put('L',50);
//         m.put('C',100);
//         m.put('D',500);
//         m.put('M',1000);
//         int ans=0;
//         for(int i=0;i<s.length();i++){
//             if( i<s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
//                 ans-=m.get(s.charAt(i));
//             }
//             else{
//                 ans+=m.get(s.charAt(i));
//             }
//         }
//         return ans;
//     }
// }

//  class Solution {
//       public int romanToInt(String s) {
//          int ans = 0, num = 0;
//         for (int i = s.length()-1; i >= 0; i--) {
//             switch(s.charAt(i)) {
//                 case 'I': num = 1; break;
//                 case 'V': num = 5; break;
//                 case 'X': num = 10; break;
//                 case 'L': num = 50; break;
//                 case 'C': num = 100; break;
//                 case 'D': num = 500; break;
//                 case 'M': num = 1000; break;
//             }
//             if (4 * num < ans) ans -= num;
//             else ans += num;
//         }
//         return ans;
//     }
//  }