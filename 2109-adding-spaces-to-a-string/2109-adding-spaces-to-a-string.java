class Solution {
    public String addSpaces(String s, int[] spaces) {
        int j=0;
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(j<spaces.length && i==spaces[j]){
                b.append(" ");
                j++;
            }
            b.append(s.charAt(i));
        }
        return b.toString();
    }
}