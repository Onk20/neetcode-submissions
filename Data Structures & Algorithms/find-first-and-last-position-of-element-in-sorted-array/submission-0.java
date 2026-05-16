class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);

        return new int[]{left, right};
        
    }

    private int binarySearch(int[] nums, int target, boolean leftSearch){

        int l = 0, ans = -1, r = nums.length - 1;

        while(l <= r){

            int m = l + (r - l) / 2;

            if(target > nums[m]){
                l = m + 1;
            }
            else if(target < nums[m]){
                r = m - 1;
            }
            else{
                ans = m;
                if(leftSearch){
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }
        }

        return ans;
    }
}