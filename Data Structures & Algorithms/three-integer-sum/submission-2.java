class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int N = nums.length;

        for(int i=0; i<N; i++){

            if(i > 0 && nums[i-1] == nums[i]){
                continue;
            }

            int j = i+1;
            int k = N-1;

            while(j < k){
                int total = nums[i] + nums[j] + nums[k];

                if(total < 0){
                    j++;
                }else if(total > 0){
                    k--;
                }else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }

                
            }
        }

        return ans;
    }
}
