class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
      int c=1;
      int max=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {

            if(nums[i]==nums[i-1])
            {
                continue;
            }
         if(nums[i]==nums[i-1]+1)
            {
                c++;
              

            }else{
                max=Math.max(c,max);
                c=1;
            }




        }
        max=Math.max(max,c);
        return max;}}
       