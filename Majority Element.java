class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
      return nums[n/2];

//Done by Sorting




     ----------------------------OR-----------------------
//Done by Moore voting Alogorithm
  

class Solution {
    public int majorityElement(int[] nums) {
        int cand =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                cand=nums[i];
            }
            if(cand==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return cand;
    }
}
