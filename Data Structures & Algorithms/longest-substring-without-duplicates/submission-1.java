class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // Using HashMap approach

        int left = 0, right = 0;
        int maxAns = 0;

        int N = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while(right < N){

            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }

            map.put(s.charAt(right), right);

            maxAns = Math.max(maxAns, right - left + 1);
            right++;
        }

        return maxAns;
    }
}
