class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res =new int [nums.length];
        int r = 1;
        for (int i =0; i< nums.length; i++){
            res[i] = r;
            r  *= nums[i];
        }
        int l = 1;
        for(int i = nums.length -1; i >= 0; i--){
            res[i] *= l;
            l *= nums[i];
        }
        return res;
        }
}