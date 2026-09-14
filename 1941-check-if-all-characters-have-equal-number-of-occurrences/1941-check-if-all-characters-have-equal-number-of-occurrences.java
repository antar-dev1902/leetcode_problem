class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);        
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:map.values()){
            set.add(i);
        }
        return set.size()==1;
    }
}