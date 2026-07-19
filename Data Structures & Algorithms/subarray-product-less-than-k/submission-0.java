class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int res = 0, l = 0, r = 0;
        long product = 1;

        for(r = 0; r<nums.length; r++){

            product = product * nums[r];

            while(l <= r && product >= k){
                product = product / nums[l];
                l++;
            }

            res = res + (r-l+1);
        }

        return res;
    }
}