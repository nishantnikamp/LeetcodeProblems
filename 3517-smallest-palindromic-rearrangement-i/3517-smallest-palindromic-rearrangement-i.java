class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder firstHalf = new StringBuilder();
        String middle ="";

        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch -'a']++;
        }
        for(int i=0; i< 26; i++){
            if((freq[i] & 1) == 1){
                middle = String.valueOf((char)('a'+i) );
            }
            for(int j =0; j< freq[i]/2; j++){
                firstHalf.append((char) ('a'+i));
            }
        }
        String secondHalf= new StringBuilder(firstHalf).reverse().toString();

        return firstHalf.toString() + middle + secondHalf;

    }
}