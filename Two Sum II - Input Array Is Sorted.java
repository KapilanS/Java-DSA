class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Initialize two pointers
        int left = 0;
        int right = numbers.length - 1;
        
        // Use the two-pointer technique
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // Return the 1-based indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }
        
        // Since the problem guarantees exactly one solution, no need for additional error handling
        throw new IllegalArgumentException("No two sum solution");
    }
}
