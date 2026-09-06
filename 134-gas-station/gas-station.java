class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum=0;
        int costsum=0;
        for(int i=0;i<gas.length;i++){
            gassum+=gas[i];
            costsum+=cost[i];
        }
        if(gassum<costsum){
            return -1;
        }
        int n=gas.length;
        int total=0;
        int start=0;
        for(int i=0;i<n;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                start=i+1;
            }
        }
        return start;
    }
}