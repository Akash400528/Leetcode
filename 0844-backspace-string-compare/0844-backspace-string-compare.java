class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(!stack.isEmpty()){
                stack.pop();}}
            
            else{
              stack.push(s.charAt(i));
            }}
        for(int j=0;j<t.length();j++)
        {
            if(t.charAt(j)=='#')
            {
                 if(!stack2.isEmpty()){
                stack2.pop();}}
            else{
                stack2.push(t.charAt(j));
            }}
        return stack.equals(stack2);}}