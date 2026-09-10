class Solution {
   public static boolean isAnagram(String s, String t) 
    {
        int n=t.length();
        if(s.length()!=n)
        {
            return false;
        }
        int freq[] = new int[26];
        for(int i=0;i<t.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}