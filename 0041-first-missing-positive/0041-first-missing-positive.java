class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr = Arrays.stream(nums).filter(n -> n > 0).toArray();
        Arrays.sort(arr);

        int firstPos = 1;
        for (int n : arr) {
            if (n == firstPos) {
                firstPos++;
            } else if (n > firstPos) {
                return firstPos;
            }
        }
        return firstPos;
    }
}