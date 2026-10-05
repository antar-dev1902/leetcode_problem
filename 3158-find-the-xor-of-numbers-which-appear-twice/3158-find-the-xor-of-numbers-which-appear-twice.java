class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        int x=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==2){
                x=x^entry.getKey();
            }
        }
        return x;
    }
}