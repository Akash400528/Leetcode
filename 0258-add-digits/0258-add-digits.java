class Solution {
    public int addDigits(int num) {
    int p=num;
    int i=0;
   while(i==0)
   {
     p=hlo(p);
     String h=String.valueOf(p);
     if(h.length()==1)
     {
        return p;
     }
   }
   return 0;
   }
     
        
    
    static int hlo(int l)
    {
        int sum=0;
        while(l!=0)
        {
            int r=l%10;
            sum+=r;
            l/=10;
        }
    
        return sum;
    }
}