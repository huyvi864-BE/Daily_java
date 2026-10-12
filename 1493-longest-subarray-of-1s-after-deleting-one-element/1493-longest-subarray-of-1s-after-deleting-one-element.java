class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int maxLength = 0;
        int count = 0;
        for (int i =0; i < nums.length; i++){
            if(nums[i]==0){
                count++;
            }
            while (count >1){
                if (nums[l]==0){
                    count--;
                }
                l++;
            }
            maxLength = Math.max(maxLength, i-l);
        }
        return maxLength;
    }
}