class Solution {
    public int countCommas(int n) {
        int t=n;
        String a=String.valueOf(t);
        int c=a.length();
      if(c<=3)
      {
        return 0;
      }
        int j=1;
        int m=1000;
        if(c>3)
        {
          
           while(t!=m)
           {
            j++;
            m++;
           }

        }
        return j;

    }
}