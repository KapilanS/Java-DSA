class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer, Integer> countMap = new HashMap<>();
         for (int i=0;i<nums.length;i++) {
            int num=nums[i];
            if (countMap.containsKey(num)) {
                return true;
            }
            countMap.put(num, 1);
        }
        return false;
    }

    
}
