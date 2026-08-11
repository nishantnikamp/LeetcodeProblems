class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for(int i = 0; i<nums.length; i++){
          xor ^= nums[i] ^ i;
        }

        return xor;
    //    int sum =0;
    //     int n = nums.length;
    //     for(int i = 0; i<n; i++){
    //        sum +=nums[i];
    //     }
    //     int maxSum = n *(n+1)/2;
    //     return maxSum - sum;
    }
}

