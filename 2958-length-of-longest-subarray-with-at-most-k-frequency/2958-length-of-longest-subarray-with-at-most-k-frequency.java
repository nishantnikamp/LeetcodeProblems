class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int len = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        for (int right = left; right < n; right++) {
            int cur = nums[right];
            freq.put(cur, freq.getOrDefault(cur, 0) + 1);
            while (freq.get(cur) > k) {
                int remove = nums[left];
                freq.put(remove, freq.get(remove) - 1);
                left++;
            }
            len = Math.max(len, right - left + 1);
        }
        return len;
    }
}