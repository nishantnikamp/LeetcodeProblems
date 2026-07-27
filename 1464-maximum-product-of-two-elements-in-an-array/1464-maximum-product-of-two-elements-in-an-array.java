class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // return ((nums[nums.length-1] -1) * (nums[nums.length-2] -1));

        // int maxProd = 0;
        // int prod =1;

        int pa =-1;
        int pb =-1;

        for(int i =0; i<nums.length; i++){
            if(pa<=nums[i]){
                pb = pa;
                pa =nums[i];
            }
            else if(pb <=nums[i]){
                pb = nums[i];
            }
        }
        return((pa-1)* (pb-1));
    }
}