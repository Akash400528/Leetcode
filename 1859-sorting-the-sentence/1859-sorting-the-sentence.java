class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> map=new HashMap<>();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            char[] fre=arr[i].toCharArray();
            String a="";
            for(int k=0;k<fre.length-1;k++)
            {
                a+=fre[k];
            }
            char m=fre[fre.length-1];
            int h = (int)(m-'0');
            map.put(h,a);
           
        }
       
        StringBuilder str=new StringBuilder();
        for(int l=1;l<=arr.length;l++)
        {
            
                str.append(map.get(l));
                str.append(" ");
       

        }
        return new String(str).trim();}}
        
