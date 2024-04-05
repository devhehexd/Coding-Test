class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;

        int[] numbers = new int[included.length];

        for (int i = 0; i < included.length; i++) {
            numbers[i] = a + ((i + 1) - 1) * d;
            if (included[i] == true) {
                answer += numbers[i];
            }
        }
        return answer;
    }
}