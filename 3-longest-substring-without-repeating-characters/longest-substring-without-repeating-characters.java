class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            String b = "";
            for (int j = i; j < s.length(); j++) {
                int c = 0;
                for (int k = 0; k < b.length(); k++) {
                    if (b.charAt(k) == s.charAt(j)) {
                        c = 1;
                        break;
                    }
                }
                if (c == 1) {
                    break;
                }
                b = b + s.charAt(j);
                if (b.length() > a) {
                    a = b.length();
                }
            }
        }
        return a;
    }
}