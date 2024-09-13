import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        double slopeA = (double) (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        double slopeA_a = (double) (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        double slopeB = (double) (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        double slopeB_b = (double) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        double slopeC = (double) (dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        double slopeC_c = (double) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);

        if (slopeA == slopeA_a) {
            answer = 1;
        }
        if (slopeB == slopeB_b) {
            answer = 1;
        }
        if (slopeC == slopeC_c) {
            answer = 1;
        }
        return answer;
    }
}