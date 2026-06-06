class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Check if s1 is smaller if it is smaller return false directly.
        if(s1.length() > s2.length()){
            return false;
        }

        // Create 2 freqency array for s1 and s2

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Fill the ferqency of s1 characters into the array first
        for(char c : s1.toCharArray()){
            freq1[c - 'a']++;
        }

        // Initialize a left pointer for sliding window approach
        // so that the left pointer we can shrink if window exceeds s1.length()
        int left = 0;

        // Iterate over s2 with right pointer
        // update the freq2 array for s2 string
        // check if the sliding window size i.e (right - left + 1) is exceeds s1.length()
        // if it exceeds shrink the window from left side
        // i.e reduce the freqency of the char at left pointer
        // when freq2 and s1.length() matches then compare both the freq arrays
        // if freq array has same values at all 26 places 
        // Then it is confirmed that the characters present in them are exactly same
        // so we can confirm that the permutation exists in string s2.
        for(int right = 0; right < s2.length(); right++){

            freq2[s2.charAt(right) - 'a']++;

            if(right - left + 1 > s1.length()){
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }

            if(right - left + 1 == s1.length()){

                boolean isMatch = true;

                for(int i=0; i<26; i++){
                    if(freq1[i] != freq2[i]){
                        isMatch = false;
                        break;  // Don't return fasle we just discarded this substring
                    }
                }

                if(isMatch) return true;
            }
        }

        return false;
    }
}
