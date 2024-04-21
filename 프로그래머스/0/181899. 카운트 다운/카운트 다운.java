class Solution {
    public int[] solution(int start, int end_num) {
       int range = (start - end_num) + 1;

        int[] answer = new int[range];

        for (int i = 0; i < range; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}