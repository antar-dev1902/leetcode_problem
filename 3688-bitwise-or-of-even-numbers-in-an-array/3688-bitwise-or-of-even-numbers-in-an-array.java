class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int num=0;
        for(int i:nums){
            if(i%2==0){
                num=num|i;
            }
        }
        return num;
    }
}