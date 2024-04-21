class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int intervalA = intervals[0][1] - intervals[0][0] + 1;
        int intervalB = intervals[1][1] - intervals[1][0] + 1;

        int[] answer = new int[intervalA + intervalB];

        for (int i = 0; i < intervalA; i++) {
            answer[i] = arr[intervals[0][0] + i];
        }
        for (int i = intervalA; i < answer.length; i++) {
            answer[i] = arr[intervals[1][0]++];
        }
        return answer;
    }
}