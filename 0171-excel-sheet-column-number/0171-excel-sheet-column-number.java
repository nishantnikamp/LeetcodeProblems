class Solution {
    public int titleToNumber(String columnTitle) {
        long result =0;
        for(int i=0; i<columnTitle.length(); i++){
            result = result * 26 + (columnTitle.charAt(i) - 'A' +1);
        }
        return (int) result;
    }
}