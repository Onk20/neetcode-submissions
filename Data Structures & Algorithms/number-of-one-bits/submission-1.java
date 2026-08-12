class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        // int helper = 1;

        // for(int i=0; i<32; i++){

        //     if((n & helper) != 0){
        //         result++;
        //     }

        //     helper = helper << 1;
        // }

        

        // Approach 2 :- when we do n & (n-1) the left significant 1 bit
        // is converted to 0, so we'll do this n & (n-1) and count how many
        // time it gives non-zero result. Once it gives zero result it means 
        // we have converted all 1 bits to 0.

        while(n != 0){
            n = n & n-1;
            result++;
        }

        return result;
    }
}
