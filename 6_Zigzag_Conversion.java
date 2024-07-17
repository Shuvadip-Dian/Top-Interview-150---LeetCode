class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder answer = new StringBuilder();
        int n = s.length();
        int diff = 2 * (numRows - 1);
        int diagonalDiff = diff;
        int secondIndex;
        int index;
        for (int i = 0; i < numRows; i++) {
            index = i;

            while (index < n) {
                answer.append(s.charAt(index));
                if (i != 0 && i != numRows - 1) {
                    diagonalDiff = diff-2*i;
                    secondIndex = index + diagonalDiff;
               
                    if (secondIndex < n) {
                        answer.append(s.charAt(secondIndex));
                    }
                }
                index += diff;
            }
        }
        return answer.toString();
    }
}

// class Solution{
//     public String convert(String s, int nRows) {
//         char[] c = s.toCharArray();
//         int len = c.length;
//         StringBuffer[] sb = new StringBuffer[nRows];
//         for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
//         int i = 0;
//         while (i < len) {
//                 for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
//                     sb[idx].append(c[i++]);
//                 for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
//                     sb[idx].append(c[i++]);
//         }
//         for (int idx = 1; idx < sb.length; idx++)
//             sb[0].append(sb[idx]);
//         return sb[0].toString();
//     }
// }

// class Solution {
//     public String convert(String s, int numRows) {
//        if (numRows == 1 || numRows >= s.length()) {
//             return s;
//         }

//         int idx = 0, d = 1;
//         List<Character>[] rows = new ArrayList[numRows];
//         for (int i = 0; i < numRows; i++) {
//             rows[i] = new ArrayList<>();
//         }

//         for (char c : s.toCharArray()) {
//             rows[idx].add(c);
//             if (idx == 0) {
//                 d = 1;
//             } else if (idx == numRows - 1) {
//                 d = -1;
//             }
//             idx += d;
//         }

//         StringBuilder result = new StringBuilder();
//         for (List<Character> row : rows) {
//             for (char c : row) {
//                 result.append(c);
//             }
//         }

//         return result.toString();        
//     }
// }