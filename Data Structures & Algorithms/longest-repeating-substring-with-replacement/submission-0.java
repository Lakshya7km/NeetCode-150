class Solution {
    public int characterReplacement(String s, int k) {
          int[] count = new int[26];
        
        int l = 0;
        int maxFreq = 0;
        int maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            // 1. Add right character to current window
            char rightChar = s.charAt(r);
            count[rightChar - 'A']++;
            
            // 2. Track maximum frequency seen in any character inside window
            maxFreq = Math.max(maxFreq, count[rightChar - 'A']);
            // 3. If window becomes invalid, shrink from left
            int windowLength = r - l + 1;
            if (windowLength - maxFreq > k) {
                char leftChar = s.charAt(l);
                count[leftChar - 'A']--;
                l++;
            }
            // 4. Update maxLen with valid window size
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
