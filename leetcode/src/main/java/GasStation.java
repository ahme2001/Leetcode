import java.util.*;

public class GasStation {
    int[] test;
    public int canCompleteCircuit(int[] gas, int[] cost) {
        test = new int[gas.length];
        Arrays.fill(test,-1);
        for(int i=0;i<gas.length;i++){
            if(gas[i] < cost[i])    continue;
            int temp = (i+1)==gas.length?0:i+1;
            if(checkAmount(gas,cost,i,i+1,gas[i]-cost[i]+gas[temp]))
                return i;
        }
        return -1;
    }
    private boolean checkAmount(int[] gas,int[] cost,int start,int index,int amount){
        if(index == gas.length) index = 0;
        if(index == start){
            return (amount - gas[start]) >= 0;
        }
        int temp = (index+1)==gas.length?0:index+1;
        int newAmount = amount - cost[index];
        if(newAmount <= test[index]) return false;
        test[index] = newAmount;
        if(newAmount >= 0)
            return checkAmount(gas,cost,start,index+1,newAmount + gas[temp]);
        else
            return false;
    }
}
