class Solution {
    public int minChanges(int n, int k) {
        if((n|k)!=n){
            return -1;
        }
        int ans=k^n;
        int count=0;
        for(int i=0;i<31;i++){
            if((ans & (1<<i))!=0){
                count=count+1;;
            }
        }
        return count;
    }
}