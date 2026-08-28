class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String a=""+x;
        StringBuilder s=new StringBuilder(a);
        s=s.reverse();
        if(a.equals(s.toString())){
            return true;
        }
        return false;
        
    }
}