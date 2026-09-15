class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> set=new HashMap<>();
        HashMap<String,Character> set1=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=words[i];
            if(set.containsKey(c) && !set.get(c).equals(w)){
                return false;
            }
            if(set1.containsKey(w) && set1.get(w)!=c){
                return false;
            }
            set.put(c,w);
            set1.put(w,c);
        }

        return true;
        
        
    }
}