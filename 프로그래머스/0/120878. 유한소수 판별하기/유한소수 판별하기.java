class Solution {
    public int solution(int a, int b) {
        int answer = 1;

        for (int i = 1000; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
                break;
            }
        }

        while (b != 1){
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                answer = 2;
                break;
            }
        }

        return answer;
    }
}
