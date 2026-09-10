class Solution {
    public String smallestSubsequence(String s) {
        Map<Character, Integer> last = new HashMap<>();
        Set<Character> used = new HashSet<>();
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
            last.put(s.charAt(i), i);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (used.contains(ch))
                continue;

            while (stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch &&
                   last.get(stack.charAt(stack.length() - 1)) > i) {
                char removed = stack.charAt(stack.length() - 1);
                stack.deleteCharAt(stack.length() - 1);
                used.remove(removed);
            }

            stack.append(ch);
            used.add(ch);
        }

        return stack.toString();
    }
}