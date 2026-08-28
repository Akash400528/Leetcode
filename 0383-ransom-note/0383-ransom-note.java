class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      
        char[] arr=ransomNote.toCharArray();
        char[] arr2=magazine.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr[i]==arr2[j])
                {
                    arr[i]='1';
                    arr2[j]='1';
                    break;
                }
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]!='1')
            {
                return false;
            }
        }
        return true;

        
    }
}