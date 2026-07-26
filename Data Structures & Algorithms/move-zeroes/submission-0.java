class Solution {
    public void moveZeroes(int[] nums) {
        
        // 1. Two pointer approach
        //  We'll keep left and right pointer initilized to 0 and we traverse through right pointer
        //  when we find any non - zero element we add it to nums[left] and do left++;
        // This way all the non - zero elements will gather at leftmost paft
        // and when left is less than the size of the array we can fill the remaining positions of the 
        //  array with zeros.

        int left = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] != 0){
                nums[left] = nums[right];
                left++;
            }
        }

        while(left < nums.length){
            nums[left] = 0;
            left++;
        }


    }
}