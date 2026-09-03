import java.util.*;

class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                set.add(Integer.parseInt(""+s.charAt(i)));
            }
        }
        if(set.size()<2){
            return -1;
        }
        int b=set.last();
        return set.lower(b);

        
    }
}