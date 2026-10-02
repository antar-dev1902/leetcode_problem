class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> map=new HashMap<>();

        HashSet<Integer> set=new HashSet<>();
        
        for(int i:nums1){
            if(set.add(i)){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        
        set.clear();

        for(int i:nums2){
            if(set.add(i)){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        
        set.clear();

        for(int i:nums3){
            if(set.add(i)){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        
        set.clear();

        
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=2){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}