import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int xSum = 0;
        int constantSum = 0;
        
        String[] terms = polynomial.split(" \\+ ");
        
        for(String term : terms) {
            if(term.contains("x")) {
                String num = term.replace("x", "");
                int extract = num.equals("") ? 1 : Integer.parseInt(num);
                xSum += extract;
            } else {
                constantSum += Integer.parseInt(term);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(xSum != 0) {
            if(xSum == 1) {
                sb.append("x");
            } else {
                sb.append(xSum).append("x");
            }
        }
        
        if(constantSum != 0) {
            if(xSum != 0) {
                sb.append(" + ");
            }
            
            sb.append(constantSum);
            
        }
        
        
        
        return sb.toString();
    }
}