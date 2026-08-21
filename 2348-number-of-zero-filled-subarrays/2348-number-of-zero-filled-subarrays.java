class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
    long m=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==0)
           {
               c++;
           }
           else
           {
                m+=c+((c*(c-1))/2);
                c=0;
           
           }
          
        }
        if(c>0)
        {
           m+=c+((c*(c-1))/2);
        }
        return m;
    }
}