class Solution {

        public int smallestNumber(int n, int t) {
            
            for(int i=0;i<t;i++)
            {
                 int max=1;
                 int temp=n;
                
                while(n!=0)
                {
                    int r=n%10;
                    max*=r;
                    n/=10;
                }
                n=temp;
                if(max%t==0)
                {
                    return n;
                }
                else{
                n=n+1;
                }
            }
            return 0;}}
       
        