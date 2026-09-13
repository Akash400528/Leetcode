class Solution
{ 
    public int removeDuplicates(int[] nums) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            
            if(nums[i-1]==nums[i])
            {
                c++;
            }
            else{
                if(c>=2)
                {
                   
                    list.add(nums[i-1]);
                    list.add(nums[i-1]);
                   
                   
                    c=1;
                }
                else{
                    list.add(nums[i-1]);
                }
            }}
            if(c<2)
            {
                list.add(nums[nums.length-1]);

            }else{
              list.add(nums[nums.length-1]);
              list.add(nums[nums.length-1]);
            }
       
            for(int i=0;i<list.size();i++)
            {
                nums[i]=list.get(i);
            }
            return list.size();}}
               