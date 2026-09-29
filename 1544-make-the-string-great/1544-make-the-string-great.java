class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        
        for(char c:s.toCharArray())
        {
            
            if(Character.isUpperCase(c))
            {
               
               if(stack.isEmpty())
               {
                stack.push(c);
                continue;
               }
               char t=stack.peek();

               if(Character.isUpperCase(t))
               {
                stack.push(c);
               }
               else if(t==Character.toLowerCase(c))
               {
                stack.pop();}
                else{
                    stack.push(c);
                }
            }
            else if(Character.isLowerCase(c))
            {
                if(stack.isEmpty())
                {
                    stack.push(c);
                    continue;
                }
                char m=stack.peek();
                if(m==Character.toUpperCase(c))
                {
                    stack.pop();
                }else{
                    stack.push(c);
                }
               
            }
        }
        StringBuilder st=new StringBuilder();
        while(!stack.isEmpty())
        {
            st.append(stack.pop());
        }
    st.reverse();
    return new String(st);
    }
}