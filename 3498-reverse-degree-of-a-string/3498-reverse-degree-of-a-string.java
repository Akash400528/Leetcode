class Solution {
    public int reverseDegree(String s) {
        char[] arr=new char[26];
        char a='a';
        for(int i=arr.length-1;i>=0;i--)
        {
              arr[i]=(char)a;
              a++;
        }
        
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i+1);
        }
        char[] ch=s.toCharArray();
        int sum=0;
        for(int j=0;j<ch.length;j++)
        {
             if(map.containsKey(ch[j]))
             {
                int v=map.get(ch[j]);
                int m=v*(j+1);
                sum+=m;
                
             }
        }
        return sum;

        
    }
}