class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set=new HashSet<>();
        String s="";
        for(int i=0;i<word.length();i++){
            if(Character.isDigit(word.charAt(i))){
                 s+=word.charAt(i);
            }else{
                if(s==""){
                    continue;
                }
                s = s.replaceFirst("^0+(?!$)", "");
                set.add(s);
                s="";
            }
        }
        if (!s.equals("")) {
            s = s.replaceFirst("^0+(?!$)", "");
            set.add(s);
        }
        return set.size();
        
    }
}