class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int n=0;
        for(int i=1;i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                n=i;
            }
        }
        return n;
        
    }
}