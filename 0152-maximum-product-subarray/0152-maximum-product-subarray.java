class Solution {
    public int maxProduct(int[] nums) {
        if(nums[0]<0 && nums.length==1)
        {
            return nums[0];
        }
        int pro=1;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                pro*=nums[j];
                max=Math.max(max,pro);
            }
            pro=1;
        }
        return max;}}
        
       