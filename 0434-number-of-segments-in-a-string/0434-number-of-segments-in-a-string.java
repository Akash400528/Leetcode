class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        String[] arr=s.split(" ");
      int c=0;
      for(int i=0;i<arr.length;i++)
      {
        if(!arr[i].equals(""))
        {
            c++;
        }
      }
      return c;
        
    }
}