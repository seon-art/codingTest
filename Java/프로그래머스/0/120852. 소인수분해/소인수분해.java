import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int count = 2;
        
        while(n > 1) {
            if(n % count == 0) {
                n = n / count;
                answer.add(count);
            } else {
                count++;
            }
        }
        
        return answer.stream().distinct().mapToInt(i -> i).toArray();
    }
}