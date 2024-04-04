class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);

        String add1 = num1 + num2;
        String add2 = num2 + num1;

        int result1 = Integer.valueOf(add1);
        int result2 = Integer.valueOf(add2);

        if (result1 == result2) {
            return answer = result1;
        } else if (result1 > result2) {
            return answer = result1;
        }else {
            return answer = result2;
        }
        
    }
}