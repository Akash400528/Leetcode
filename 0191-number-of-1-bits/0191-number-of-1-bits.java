class Solution {
    public int hammingWeight(int n) {
        String m="";
        while(n!=0)
        {
            int x=n%2;
            m+=x;
            n/=2;

        }
        String y="";
        for(int i=m.length()-1;i>=0;i--)
        {
             y+=m.charAt(i);
        }
        int c=0;
        for(int i=0;i<m.length();i++)
        {
            if(y.charAt(i)=='1')
            {
                c++;
            }
        }
        return c;
        
    }
}