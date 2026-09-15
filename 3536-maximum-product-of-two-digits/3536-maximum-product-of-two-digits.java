class Solution {
    public int maxProduct(int n) {
        
        List<Integer> list=new ArrayList<>();
        while(n!=0)
        {
            int r=n%10;
            list.add(r);
            n/=10;

        }
        int[] nums=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
           nums[i]=list.get(i);
        }
        Arrays.sort(nums);
        int a=nums[nums.length-2];
        int b=nums[nums.length-1];
        return a*b;
    }
}