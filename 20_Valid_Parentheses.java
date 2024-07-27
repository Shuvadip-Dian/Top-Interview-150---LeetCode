import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') 
                stack.push(')'); 
            else if (c == '{')
                stack.push('}');
            else if (c == '[') 
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<Character>();
//         for (char c : s.toCharArray()) {
//             if (c == '(' || c == '[' || c == '{') {
//                 stack.push(c);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 char top = stack.peek();
//                 if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
//                     stack.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }

// class Solution {
//     public boolean isValid(String s) {
//         HashMap<Character, Character> Hmap = new HashMap<Character, Character>();
//         Hmap.put(')','(');
//         Hmap.put('}','{');
//         Hmap.put(']','[');
//         Stack<Character> stack = new Stack<Character>();
//         for (int idx = 0; idx < s.length(); idx++){
//             if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
//                 stack.push(s.charAt(idx));
//                 continue;
//             }
//             if (stack.size() == 0 || Hmap.get(s.charAt(idx)) != stack.pop()) {
//                 return false;
//             }
//         }
//         if (stack.size() == 0) {
//             return true;
//         }
//         return false;
//     }
// }