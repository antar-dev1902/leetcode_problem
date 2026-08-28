import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack=new ArrayDeque<>();

        for(String s:operations){
            if(s.equals("+")){
                int last=stack.removeLast();
                int secondl=stack.peekLast();
                int sum=last+secondl;
                stack.addLast(last);
                stack.addLast(sum);

            }
            else if(s.equals("D")){
                stack.addLast(stack.peekLast()*2);
            }
            else if(s.equals("C")){
                stack.removeLast();
            }
            else{
                stack.addLast(Integer.parseInt(s));
            }

        }
        int score=0;
        for(int num:stack){
            score+=num;
        }
        return score;
        
    }
}