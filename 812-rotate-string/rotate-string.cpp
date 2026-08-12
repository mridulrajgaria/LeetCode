class Solution {
public:
    bool rotateString(string s, string goal) {
        string s1=s+s;
        if(s1.contains(goal) && goal.length()==s.length()){
            return true;
        }
        return false;
    }
};