class Solution {
    public int smallestNumber(int n) {
        String str = Integer.toBinaryString(n);
        int out = Integer.parseInt(check(str), 2);
        return out;
    }
    public String check(String a) {
        char[] ch = a.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == '0') {
                ch[i] = '1';
            }
        }
        return String.valueOf(ch);
    }
}