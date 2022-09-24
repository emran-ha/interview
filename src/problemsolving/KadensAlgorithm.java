package problemsolving;

class KadensAlgorithm {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0], globalMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(nums[i], nums[i] + currentMax);
            globalMax = Math.max(currentMax, globalMax);
        }
        return globalMax;
    }
}