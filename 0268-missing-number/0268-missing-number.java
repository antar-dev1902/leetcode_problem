import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int sum1=0;
        for(int i:nums){
            sum1+=i;
        }  
        int sum2=0;
        for(int i=0;i<=nums.length;i++){
            sum2+=i;
        }
        return sum2-sum1;

    }
}