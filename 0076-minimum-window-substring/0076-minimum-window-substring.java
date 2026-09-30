class Solution {
    public String minWindow(String s, String t) {
        int[] fre=new int[128];
        for(char c:t.toCharArray())
        {
           fre[c]++;
        }
        int l=0;
        int min=Integer.MAX_VALUE;
        int c=0;
        int st=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(fre[ch]>0)
            {
                c++;
            }
            fre[ch]--;
            while(c==t.length())
            {
                if(i-l+1<min)
                {
                    min=i-l+1;
                    st=l;
                                }
                char r=s.charAt(l);
                fre[r]++;
                if(fre[r]>0)
                {
                    c--;
                }
                l++;
                                        }
            }
            if(min==Integer.MAX_VALUE)
            {
                return "";
            }
            return s.substring(st,st+min);
        }
        
    }
