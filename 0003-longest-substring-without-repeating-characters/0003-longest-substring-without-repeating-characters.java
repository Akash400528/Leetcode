class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0;
        int max=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]) && map.get(arr[i])>=l)
            {
                l=map.get(arr[i])+1;
            }
            map.put(arr[i],i);
            max=Math.max(max,i-l+1);
        }
        return max;}}