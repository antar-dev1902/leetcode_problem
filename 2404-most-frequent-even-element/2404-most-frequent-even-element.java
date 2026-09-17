class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int num=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()%2==0){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    num=entry.getKey();
                    continue;
                }else if(entry.getValue()==max){
                    num=Math.min(entry.getKey(),num);
                }
            }
        }
        return num;  
    }
}