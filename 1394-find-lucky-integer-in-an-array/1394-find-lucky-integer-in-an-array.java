class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        TreeSet<Integer> set=new TreeSet<>();
        set.add(-1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                set.add(entry.getKey());
            }
        }
        return set.last();
    }
}