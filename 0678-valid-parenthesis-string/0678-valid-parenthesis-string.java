
class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open=new Stack<>();
        Stack<Integer> close=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open.push(i);
            }else if (ch=='*')
            {
                close.push(i);
            }else{
                if(!open.isEmpty())
                {
                    open.pop();
                }
                else if(!close.isEmpty())
                {
                    close.pop();
                }else{
                    return false;
                }
            }
        }
        while(!open.isEmpty()&&!close.isEmpty())
        {
            if(open.peek()>close.peek())
{
    return false;
}    
open.pop();
close.pop();    }
return open.isEmpty();

    }}
        