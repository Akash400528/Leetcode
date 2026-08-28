class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] arr=jewels.toCharArray();
        char[] arr2=stones.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr[i]==arr2[j])
                {
                    c++;
                }
            }
        }
        return c;
        
    }
}