class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        HashMap<String, Integer> map = new HashMap<>();

        HashSet<String> bannedSet = new HashSet<>();
        for(String b : banned) {
            bannedSet.add(b);
        }

        for(String  word : words){
            if(!bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        int maxFreq =0;
        String maxWord = "";

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue(); 
                maxWord = entry.getKey();
            }
        }
        return maxWord;
    }
}