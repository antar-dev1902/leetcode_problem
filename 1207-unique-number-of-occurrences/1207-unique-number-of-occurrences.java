class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i:map.values()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:map1.values()){
            if(i>1){
                return false;
            }
        }
        return true;
    }
}