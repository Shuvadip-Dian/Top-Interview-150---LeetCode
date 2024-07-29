import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        int a,b;
        for(String s:tokens){
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(s.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a-b);
            }
            else if(s.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(s.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}

// class Solution {
//     public int evalRPN(String[] tokens) {
//         int[] stack = new int[tokens.length];
//         int top = 0;
//         for(String s : tokens) {
//             char c = s.charAt(0);
//             if(c=='+') {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a+b;
//             } else if(c=='-' && s.length()==1) {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a-b;
//             } else if(c=='*') {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a*b;
//             } else if(c=='/') {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a/b;
//             } else 
//                 stack[top++] = Integer.parseInt(s);
//         }
//         return stack[0];
//     }
// }