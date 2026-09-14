class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
       for(int i=1;i<=nums.length+1;i++)
       {
            list.add(i*k);
         }
         for(int j=0;j<list.size()+1;j++)
         {
            boolean t=false;
            for(int m=0;m<nums.length;m++)
            {
                if(list.get(j)==nums[m])
                {
                    t=true;
                    break;
                }
            }
            if(t==false)
            {
                return list.get(j);
            }
         }
         return k*2;
        
    }
}