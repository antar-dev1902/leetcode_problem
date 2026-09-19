class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for(char a:s.toCharArray()){
            if(s.indexOf(a)!=s.lastIndexOf(a)){
                max=Math.max(max,s.lastIndexOf(a)-s.indexOf(a)-1);
            }
        }
        return max;
    }
}