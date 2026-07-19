class Solution {
    public int firstUniqChar(String s) {
        char c[] =s.toCharArray();
        int n = s.length();
        int freq[] = new int[26];
        for(int i =0; i< n; i++){
            freq[c[i] - 'a']++;
            
        }
        for(int i =0; i< n; i++){
            if(freq[c[i] - 'a'] == 1)
                return i;
        }        
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna