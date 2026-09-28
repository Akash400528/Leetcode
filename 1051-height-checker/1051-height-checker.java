class Solution {
    public int heightChecker(int[] heights) {
        int[] nums=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            nums[i]=heights[i];
        }
        Arrays.sort(heights);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]!=heights[i])
             {
                c++;
             }
        }
        return c;
        
    }
}