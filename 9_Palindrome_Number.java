class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y=x;
        int res=0,sum=0;
        while(x!=0){
            res=x%10;
            sum=(sum*10)+res;
            x=x/10;
        }
        if(sum==y) return true;
        return false;
    }
}