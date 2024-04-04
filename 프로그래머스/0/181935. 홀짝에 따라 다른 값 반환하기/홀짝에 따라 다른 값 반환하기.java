class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 0){
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }

        }else {
            int odd = (n + 1) / 2;
            answer = (int) Math.pow(odd, 2);

        }return answer;
    } 
}