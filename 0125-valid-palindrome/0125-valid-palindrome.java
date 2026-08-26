class Solution {
    public boolean isPalindrome(String s) {
        
        String h=s.toLowerCase();
        StringBuilder hlo=new StringBuilder("");
        for(int i=0;i<h.length();i++)
        {
            if(Character.isLetterOrDigit(h.charAt(i)))
            {
                hlo.append(h.charAt(i));
            }
        }
       
        int l=0;
        int r=hlo.length()-1;
        while(l<r)
        {
            if(hlo.charAt(l)!=hlo.charAt(r))
            {
                return false;
            }
            
            l++;
            r--;
        }
        return true;
    }
}