class Solution {
    public int bitwiseComplement(int n) {
        String a=Integer.toBinaryString(n);
        String b="";
        for(char i:a.toCharArray()){
            if(i=='1'){
                b+=0;
            }else{
                b+=1;
            }
        }
        int num=Integer.parseInt(b,2);
        return num;
    }
}