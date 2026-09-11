class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        s1=s1+" "+s2;
        HashMap<String,Integer> map=new HashMap<>();
        for(String word: s1.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        ArrayList<String> set=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                set.add(entry.getKey());
            }
        }
        return set.toArray(new String[0]);
    }
}