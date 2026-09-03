class Solution {
    public String replaceDigits(String s) {
        StringBuilder b=new StringBuilder(s);
        for(int i=1;i<s.length();i+=2){
            char a=b.charAt(i);
            if(Character.isDigit(a)){
                b.setCharAt(i,(char)(s.charAt(i-1)+Integer.parseInt(""+a)));
            }
        }
        return b.toString();
        
    }
}