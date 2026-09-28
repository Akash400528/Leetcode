class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        char[] arr=s.toCharArray();
        int c=0;int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='(')
            {
                stack.push(arr[i]);
            }
            else if(arr[i]==')')
            {
                stack.pop();
                
            
            }
            max=Math.max(max,stack.size());
      
        }
        return max;
        
    }
}