class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] arr=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            
        }int c=0;
        for(int j=nums.length;j<arr.length;j++)
        {
            int s=hlo(nums[c]);
            arr[j]=s;
            c++;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        return set.size();
    }
    static int hlo(int c)
    {
        int y=0;
        while(c!=0)
        {
            int r=c%10;
            y=y*10+r;
            c/=10;

        }
        return y;
    }
}