class Solution {
    public boolean canJump(int[] nums) {
        int sl=nums[0];
        for(int i=1;i<nums.length;i++){
            sl--;
            if(sl<0) return false;
            
            if(i==nums.length-1) return true;

            if(nums[i]>sl){
                sl=nums[i];
            }
        }
        return true;
    }
}
