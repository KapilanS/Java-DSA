class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = leftidx(nums,target);
        int right = rightidx(nums,target);
        return new int[]{left,right};
    }
    private int leftidx(int[] nums,int target){
        int idx=-1;int low=0;int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                idx=mid;
                
            }
            if(nums[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return idx;
    }
    private int rightidx(int[] nums,int target){
        int idx=-1;int low=0;int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                idx=mid;
                
            }
            if(nums[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return idx;
    }
}
