class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
                    int l=sum(nums[i]);
                    if(l==i)
                    {
                        return i;
                    }
                }
            
        
        return -1;}
        
        static int sum(int y)
        {
            int s=0;
            while(y!=0)
            {
                int d=y%10;
                s+=d;
                y/=10;
            }
            return s;
        }

    }
