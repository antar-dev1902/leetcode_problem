class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            map.put(n%10,map.getOrDefault(n%10,0)+1);
            n=n/10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            sum+=(entry.getKey()*entry.getValue());
        }
        return sum;
        
    }
}