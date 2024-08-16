class Solution {
    public double myPow(double x, int n) {
        int dup=n;
        double ans = 1;
        if(n<0){
            n=-(n+1);  // for Integer.MIN_VALUE
            ans=ans*x;
        }
        while(n!=0){
            if(n%2==0){
                x=x*x;
                n=n/2;
            }
            else{
                ans=ans*x;
                n=n-1;
            }
        }
        if(dup<0){
            return 1/ans;
        }
        return ans;
    }
}