class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>(); 
        
        for(char i:stones.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(char i:jewels.toCharArray()){
           count+=map.getOrDefault(i,0);
        }
        return count;
    }
}