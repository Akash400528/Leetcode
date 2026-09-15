class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
         List<Integer> hlo=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=min;i<=max;i++)
        {
            list.add(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            hlo.add(nums[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            if(!hlo.contains(list.get(i)))
            {
                ans.add(list.get(i));
            }
        }
        return ans;}}