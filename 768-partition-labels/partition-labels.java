class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result=new ArrayList<>();  
        HashMap<Character,Integer> map=new HashMap<>();
        int size=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            size++;
            end=Math.max(end,map.get(ch));
            if(i==end){
                result.add(size);
                size=0;
            }
        }
        return result;
    }
}