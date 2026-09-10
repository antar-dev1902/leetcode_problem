class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> set=new HashMap<>();        
        HashMap<Character,Character> set1=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            char y=t.charAt(i);

            if(set.containsKey(x) && set.get(x)!=y){
                return false;
            }

            if(set1.containsKey(y) && set1.get(y)!=x){
                return false;
            }
            set.put(x,y);
            set1.put(y,x);
        }

        return true;        
    }
}