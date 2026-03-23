class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int k= 0,min= Integer.MAX_VALUE;
        int sum =0;
        for(int i =0; i<nums.length;i++){
            sum +=nums[i];
            while(sum>=target)
            {
                min =Math.min(min, i-k +1);
                sum -=nums[k];
                k++;
            }
        }
        return min <Integer.MAX_VALUE ? min :0;
    }
}