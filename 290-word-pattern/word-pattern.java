import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        HashMap<Character, String> a = new HashMap<>();
        HashMap<String, Character> b = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (a.containsKey(ch)) {
                if (!a.get(ch).equals(word))
                    return false;
            } else {
                a.put(ch, word);
            }
            if (b.containsKey(word)) {
                if (b.get(word) != ch)
                    return false;
            } else {
                b.put(word, ch);
            }
        }
        return true;
    }
}