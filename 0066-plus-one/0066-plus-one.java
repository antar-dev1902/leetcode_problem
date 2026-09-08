import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> set=new ArrayList<>();
        int carry=0;
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+carry;
            if(i==digits.length-1){
                sum+=1;
            }
            int digit=sum%10;
            carry=sum/10;
            set.add(digit);
        }
        if(carry!=0){
            set.add(carry);
        }
        Collections.reverse(set);
        int[] arr=new int[set.size()];
        for(int i=0;i<set.size();i++){
            arr[i]=set.get(i);
        }
        return arr;

    }
}