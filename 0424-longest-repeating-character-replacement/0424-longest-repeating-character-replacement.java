class Solution {
    public int characterReplacement(String s, int k) {
     int cnt[] = new int[26];
     int left =0;
     int maxFreq =0;
     int maxLength=0;
     for(int right = 0; right < s.length(); right++){
        cnt[s.charAt(right)- 'A']++;
        maxFreq = Math.max(maxFreq,cnt[s.charAt(right)- 'A']);

        while((right - left + 1) -maxFreq > k){
            cnt[s.charAt(left)- 'A']--;
            left++;
        }
        maxLength = Math.max(maxLength,right - left + 1 );
     }
     return maxLength;
    }
}

/*
int l = 0;
        int cnt[] = new int[26];
        int maxcnt = 0;
        int maxlen = 0;
        for(int r=0;r<s.length();r++)
        {
            cnt[s.charAt(r)-'A']++;
            maxcnt = Math.max(maxcnt,cnt[s.charAt(r)-'A']); 
            int window = r-l+1;
            if(window-maxcnt>k)  
            {
                cnt[s.charAt(l)-'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
 */