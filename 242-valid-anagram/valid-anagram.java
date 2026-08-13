class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq1[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char bh=t.charAt(i);
            freq2[bh-'a']++;
        }
        return(Arrays.equals(freq1,freq2));
    }
}