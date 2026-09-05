class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        int a=words.size();
            for(int i=0;i<a;i++){
                String b= words.remove(0);
                String[] c=b.split("\\Q" + separator + "\\E");
                Collections.addAll(words,c);
            }
        words.removeIf(x -> x.isEmpty());    
        return words;    
        
    }
}