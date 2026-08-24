class Solution {
    public String longestPalindrome(String s) {

        String max = "";

        for (int i = 0; i < s.length(); i++) {

            
            String odd = palindrome(s, i, i);

            
            String even = palindrome(s, i, i + 1);

            if (odd.length() > max.length()) {
                max = odd;
            }

            if (even.length() > max.length()) {
                max = even;
            }
        }

        return max;
    }

    static String palindrome(String s, int i, int j) {

        while (i >= 0 && j < s.length() &&
               s.charAt(i) == s.charAt(j)) {

            i--;
            j++;
        }

        i++;
        return s.substring(i, j);
    }
}