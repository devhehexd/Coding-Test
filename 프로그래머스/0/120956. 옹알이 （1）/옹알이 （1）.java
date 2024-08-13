import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        
        String[] babyWord = {"aya", "ye", "woo", "ma"};

        int count = 0;

        for (String bb : babbling) {
            String temp = bb;
            for (String bw : babyWord) {
                if (bb.contains(bw)) {
                    temp = temp.replace(bw, " ");
                }
            }
            temp = temp.replace(" ", "");
            if (temp.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}