class Solution {
    public int maximumLengthSubstring(String s) {
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                l.add(s.substring(i, j));
            }
        }
        int max = 0;
        for (int i = 0; i < l.size(); i++) {
            String str = l.get(i);
            int[] freq = new int[26];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                freq[ch - 'a']++;
            }
            boolean valid = true;
            for (int j = 0; j < 26; j++) {
                if (freq[j] > 2) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                max = Math.max(max, str.length());
            }
        }
        return max;
    }
}