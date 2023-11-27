class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum = 0;
        for(int i=0; i<nums.length; i++) {
            nums[i] = runningSum + nums[i];
            runningSum = nums[i];
        }
        return nums;
    }
}