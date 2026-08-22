class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int a=0;
        int b=1;
        while(n!=0)
        {
            int r=n%10;
            a+=r;
            b*=r;
            n/=10;}
            int l=a+b;
            if(t%l==0)
            {
                return true;
            }
            return false;
        
    }
}