class Solution {
    public int characterReplacement(String s, int k) {
        

        // Store the freqency of the repeated character in map
        // Store the repeated character freq as maxf
        // And substract maxf from r-l+1 i.e entire length of sliding window
        // remaining portion would be only the characters which need to be replaced
        // window size - count of the most frequent character <= k

        HashMap<Character, Integer> count = new HashMap<>();

        int res = 0;

        int l = 0, maxf = 0;

        for(int r=0; r<s.length(); r++){

            char ch = s.charAt(r);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            maxf = Math.max(maxf, count.get(ch));

            while((r-l+1) - maxf > k){
                count.put(s.charAt(l), count.getOrDefault(s.charAt(l), 0) - 1);
                l++;
            }

            res = Math.max(res, r-l+1);
        }

        return res;

    }
}
