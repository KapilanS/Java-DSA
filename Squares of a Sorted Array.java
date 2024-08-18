class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int m =nums[i]*nums[i];
            nums[i]=m;
            
        }
        Arrays.sort(nums);
        return nums;
    }
}
