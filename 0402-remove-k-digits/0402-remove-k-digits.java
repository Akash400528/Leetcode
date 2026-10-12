
import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char ch : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0
                    && ch < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder a = new StringBuilder();

        while (!stack.isEmpty()) {
            a.append(stack.pop());
        }

        a.reverse();

        while (a.length() > 0 && a.charAt(0) == '0') {
            a.deleteCharAt(0);
        }

        return a.length() == 0 ? "0" : a.toString();
    }
}
