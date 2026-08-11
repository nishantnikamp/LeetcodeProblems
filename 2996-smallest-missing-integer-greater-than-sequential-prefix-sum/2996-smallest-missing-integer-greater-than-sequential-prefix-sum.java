class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0], n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        int ans = sum;

        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (ans == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return ans;
            }
            ans++;
        }
        //  ArrayList<Integer> al = new ArrayList<>();
        //  for(int num :nums){
        //     al.add(num);
        //  }
        //  while(al.contains(sum)) 
        //     sum++; 
        //  return sum;
    }

}