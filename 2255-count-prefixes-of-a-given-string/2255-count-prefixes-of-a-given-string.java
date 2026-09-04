class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String a:words){
            if(s.startsWith(a)){
                count++;
            }
        }
        return count;
    }
}