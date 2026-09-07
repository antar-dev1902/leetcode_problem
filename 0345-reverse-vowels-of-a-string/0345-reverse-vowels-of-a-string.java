class Solution {
    public String reverseVowels(String s) {
        String a="aeiouAEIOU";
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(a.contains(""+x)){
                b.append(x);
            }
        }
        b.reverse();
        String c="";
        int j=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(a.contains(""+x)){
                c+=b.charAt(j);
                j++;
                continue;
            }
            c+=x;
        }
        return c;
        
    }
}