class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int i=1;
        int j=num-1;
        while(i<=j){
            int mid=(i+j)/2;
            if((long)mid*mid==num){
                return true;
            }
            else if((long)mid*mid>num){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return false;
        
    }
}