class Solution {
    public int thirdMax(int[] nums) {
        
       
    long lar=Long.MIN_VALUE;
        long sec=Long.MIN_VALUE;
        long thr=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==lar||nums[i]==sec||nums[i]==thr)
            {
                continue;
            }
            if(lar<nums[i])
            {
                  thr=sec;
                sec=lar;
           
                lar=nums[i];

            }
            else if(nums[i]>sec)
            {
                thr=sec;
                sec=nums[i];
            }
            else if(nums[i]>thr) {
                thr=nums[i];
            }
        
          
        }
        if(thr==Long.MIN_VALUE)
        {
            return (int)lar;
        }
        return (int)thr;}}
        
        
    