class Solution {
    public int reverseBits(int n) {
        StringBuilder a=new StringBuilder(String.format("%32s",Integer.toBinaryString(n)).replace(' ','0'));
        a.reverse();
        return Integer.parseInt(a.toString(),2);
    }
}