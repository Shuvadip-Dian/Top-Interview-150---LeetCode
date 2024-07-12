class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        while(num > 0)
        {
            for(int i = 0 ; i < values.length; i++){
                if(num >= values[i]){
                    result.append(roman[i]);
                    num -= values[i];
                    break;
                }
            }
        }
        return result.toString();
    }
}


// class Solution {
//     public String intToRoman(int num) {
//         String M[] = {"","M","MM","MMM"};
//         String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
//         String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
//         String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
//         return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[(num%10)];
//     }
// }

// class Solution {
//     public String intToRoman(int num) {
//         StringBuffer res = new StringBuffer();
//         String s = "MCMDCDCXCLXLXIXVIVI";
//         int[] ns = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//         int i = 0, j = 0, step = 1;
//         while (num > 0) {
//             if (num - ns[i] >= 0) {
//                 num -= ns[i];
//                 res.append(s.charAt(j));
//                 if (step == 2) res.append(s.charAt(j+1));
//             }
//             else {
//                 i++;
//                 j += step;
//                 step = (step == 1) ? 2 : 1;
//             }
//         }
//         return res.toString();
//     }
// }
 

//In Same time array can't store string and integer value. it can solve using map 
// class Solution {
//     public String intToRoman(int num) {
//         String Roman = "";
//         int[][] storeIntRoman = {{1000, "M"}, {900, "CM"}, {500, "D"}, {400, "CD"}, {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, {10, "X"}, {9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"}};
//         for (int i = 0; i < storeIntRoman.length; i++) {
//             while (num >= storeIntRoman[i][0]) {
//                 Roman += storeIntRoman[i][1];
//                 num -= storeIntRoman[i][0];
//             }
//         }
//         return Roman;
//     }
// }
