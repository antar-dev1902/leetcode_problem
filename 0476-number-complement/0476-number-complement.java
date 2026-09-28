class Solution {
    public int findComplement(int num) {
        String a=Integer.toBinaryString(num);
        String b="";
        for(char i:a.toCharArray()){
            if(i=='1'){
                b+=0;
            }else{
                b+=1;
            }
        }
        int n=Integer.parseInt(b,2);
        return n;
    }
}