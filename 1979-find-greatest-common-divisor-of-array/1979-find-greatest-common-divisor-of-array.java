class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }

        int x=gcd(set.first(),set.last());
        
        return x;
    }
}