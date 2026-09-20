class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int a='z'-s.charAt(i)+1;
            int v=(i+1)*a;
            sum+=v;
        }
        return sum;}}