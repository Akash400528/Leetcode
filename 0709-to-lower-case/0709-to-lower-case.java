class Solution {
    public String toLowerCase(String s) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put((char)('A' + i), (char)('a' + i));
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                ans.append(map.get(ch));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}