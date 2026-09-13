class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>(); 
        char[] s=stones.toCharArray();
        for(char i:s){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        char[] j=jewels.toCharArray();
        int count=0;
        for(char i:j){
           count+=map.getOrDefault(i,0);
        }
        return count;
    }
}