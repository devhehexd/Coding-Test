class Solution {
    public int[] solution(int[] num_list) {
        int answerLength = num_list.length + 1;
        int[] answer = new int[answerLength];


        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
            if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
                answer[i + 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
            }
            else if (num_list[num_list.length - 1] <= num_list[num_list.length - 2]){
                answer[i + 1] = num_list[num_list.length - 1] * 2;
            }
        }
        return answer;
    }
}