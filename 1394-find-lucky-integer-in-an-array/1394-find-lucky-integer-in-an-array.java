class Solution {
    public int findLucky(int[] arr) {

        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = -1;

        for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }
}