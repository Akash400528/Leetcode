class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
            
        }
        char[] arr=s.toCharArray();
        char[] hlo=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(hlo);
        if(Arrays.equals(arr,hlo))//arr.equals(hlo))
        {
            return true;
        }
        return false;
        
    }}
