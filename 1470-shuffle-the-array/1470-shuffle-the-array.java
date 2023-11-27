class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] requiredArray = new int[2*n];
        int c = 0;
        for(int i=0; i<n; i++) {
            requiredArray[c] = nums[i];
            requiredArray[c+1] = nums[i+n];
            c+=2;
        }
        return requiredArray;
    }
}