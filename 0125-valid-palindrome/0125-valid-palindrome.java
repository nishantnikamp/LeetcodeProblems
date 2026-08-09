class Solution {
    public boolean isPalindrome(String s) {
        String str= s.toLowerCase().replaceAll("[^a-z0-9]","");
        char[] ch = str.toCharArray();
        int left=0;
        int right = str.length()-1;
        while(left < right){
            if(ch[left] != ch[right])
               return false;
            left++;
            right--;
        }
        return true;
    }
}