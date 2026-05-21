class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int right = 0, left = 0, ans = 0, N = s.length();

        Map<Character, Integer> map = new HashMap<>();

        while(right < N){

            char ch = s.charAt(right);

            if(map.containsKey(ch)){

                left = Math.max(map.get(ch) + 1, left);
            }

            map.put(ch, right);

            ans = Math.max(ans, right - left + 1);
            right++;

        }

        return ans;
    }
}
