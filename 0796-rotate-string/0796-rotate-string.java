class Solution {
    public boolean rotateString(String s, String goal) {
        char[] arr=s.toCharArray();
        char[] nums=new char[arr.length];
        for(int i=1;i<=arr.length;i++)
        {
            
            for(int j=0;j<arr.length;j++)
            {
                 nums[(j+i)%arr.length]=arr[j];
            }
      
            String a=new String(nums);
            if(a.equals(goal))
            {
                return true;
            }

        }return false;
        
    
        
    }
}