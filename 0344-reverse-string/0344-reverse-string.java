class Solution {
    public void reverseString(char[] s) {
        char[] s1= new char[s.length];
        for(int i=0;i<s.length/2;i++){
            char temp=s[s.length-1-i];
            s[s.length-1-i]=s[i];
            s[i]=temp;
        }

        return ;
        
    }
}