class Solution {
    public int smallestNumber(int n) {
        String a=Integer.toBinaryString(n);
        String b="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                b+=1;
            }else{
                b+=1;
            }
        }
        return Integer.parseInt(b,2);
    }         
}