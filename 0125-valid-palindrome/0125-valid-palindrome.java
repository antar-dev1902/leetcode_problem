class Solution {
    public boolean isPalindrome(String s) {
        if(s==" "){
            return true;
        }

        String a="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                a+=s.charAt(i);
            }
        }
        a=a.toLowerCase();
        StringBuilder sb=new StringBuilder(a);
        sb=sb.reverse();
        if(a.equals(sb.toString())){
            return true;
        }
        return false;
        
    }
}