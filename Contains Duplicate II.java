class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> countmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(countmap.containsKey(nums[i])){
                int j=countmap.get(nums[i]);
                if(Math.abs(j-i)<=k){
                    return true;
                }
                
            }
            countmap.put(nums[i],i);
        }
        return false;
    }
}
