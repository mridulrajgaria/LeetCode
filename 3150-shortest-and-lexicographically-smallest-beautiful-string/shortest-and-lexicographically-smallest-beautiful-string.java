class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                int count = 0;
                for (int n = 0; n < sub.length(); n++) {
                    if (sub.charAt(n) == '1') {
                        count++;
                    }
                }
                if (count == k) {
                    arr.add(sub);
                }
            }
        }
        String smallest = arr.stream()
                .min((a, b) -> {
                    if (a.length() != b.length()) {
                        return Integer.compare(a.length(), b.length());
                    }
                    return a.compareTo(b);
                })
                .orElse("");
        return smallest;
    }
}