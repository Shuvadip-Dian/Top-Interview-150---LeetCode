class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);
        return slow == 1;
    }

    public int square(int num) {
        int ans = 0;
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }
}


// class Solution {
//     public boolean isHappy(int n) {
//         Set<Integer> seen = new HashSet<>();
//         while (n != 1 && !seen.contains(n)) {
//             seen.add(n);
//             int sum = 0;
//             while (n != 0) {
//                 int digit = n % 10;
//                 sum += digit * digit;
//                 n /= 10;
//             }
//             n = sum;
//         }
//         return n == 1;
//     }
// }