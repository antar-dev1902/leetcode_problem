class Solution {
    public boolean checkIfPangram(String sentence) {
        TreeSet<Character> set=new TreeSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        return set.size()==26;
        
    }
}