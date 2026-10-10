class Solution {
    public double average(int[] salary) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:salary){
            set.add(i);
        }
        set.pollFirst();
        set.pollLast();
        double avg=0;
        for(int i: set){
            avg+=i;
        }
        avg=avg/set.size();
        return avg;
        
    }
}