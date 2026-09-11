class Solution {
    public int mirrorDistance(int n) {
        int t=n;
        String a="";
        while(t!=0)
        {
            int r=t%10;
            a+=r;
            t/=10;

        }
        int b=Integer.parseInt(a);
        int ab=Math.abs(n-b);
        return ab;
        
    }
}