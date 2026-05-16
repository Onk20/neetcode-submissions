class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        

        int minSpeed = 1;
        int maxSpeed = Arrays.stream(piles).max().getAsInt();
        int ans = maxSpeed;

        while(minSpeed <= maxSpeed){

            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            int hours = 0;

            for(int pile : piles){

                hours += Math.ceil((double)pile/mid);
            }

            if(hours <= h){
                ans = mid;

                maxSpeed = mid -1; 
            }
            else{
                minSpeed = mid + 1;
            }
        }

        return ans;
    }
}
