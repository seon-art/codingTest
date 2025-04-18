class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        int sizeX = board[0] / 2;
        int sizeY = board[1] / 2;
        
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                if(x > -sizeX){
                    x -= 1;
                }
            } else if(keyinput[i].equals("right")) {
                if(x < sizeX){
                    x += 1;
                }
            } else if(keyinput[i].equals("up")) {
                if(y < sizeY){
                    y += 1;
                }
            } else {
                if(y > -sizeY){
                    y -= 1;
                }
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}