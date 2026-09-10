class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> anagram = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            anagram.put(ch, anagram.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!anagram.containsKey(ch) || anagram.get(ch) == 0) {
                return false;
            }
            anagram.put(ch, anagram.get(ch) - 1);
        }

        return true;
    }
}