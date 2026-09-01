class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String  s=String.join("",word1);
        String a=String.join("",word2);
        if(a.equals(s)){
            return true;
        }
        return false;
        
    }
}