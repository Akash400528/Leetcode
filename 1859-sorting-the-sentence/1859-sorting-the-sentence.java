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
            int h = Integer.parseInt(String.valueOf(m));
            map.put(h,a);
           
        }
        int n=1;
        StringBuilder str=new StringBuilder();
        for(int l=1;l<=s.length();l++)
        {
            if(map.containsKey(l))
            {
                str.append(map.get(l));
                str.append(" ");
            }

        }
        return new String(str).trim();}}
        
