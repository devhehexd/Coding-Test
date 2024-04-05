class Solution {
    public int solution(int a, int b, int c) {
       int answer = 0;
        int sum = a + b + c;
        int square = (int) (sum * ((Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2))));
        int cube = (int) (square * ((Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3))));

        if (a == b && b == c && a == c) {
            answer = cube;
        } else if (a != b && b != c && a != c) {
            answer = sum;
        } else {
            answer = square;
        }
        return answer;
        }
    }