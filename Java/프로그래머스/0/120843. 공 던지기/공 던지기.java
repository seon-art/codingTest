class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        
        for(int i = 0; i < k - 1; i++){
            answer = numbers[(index + 2) % numbers.length];
            index += 2;
        }
        return answer;
    }
} 