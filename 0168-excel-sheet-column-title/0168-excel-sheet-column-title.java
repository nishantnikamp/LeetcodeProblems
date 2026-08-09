class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;

            title.append((char) (rem +'A'));
            columnNumber = columnNumber/26;
        }
        return title.reverse().toString();
    }
}
