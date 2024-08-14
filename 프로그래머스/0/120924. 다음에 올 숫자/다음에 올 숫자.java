class Solution {
    public int solution(int[] common) {
        int answer = 0;

            if (common[1] - common[0] == common[2] - common[1]) {
                int add = common[1] - common[0];
                answer = common[common.length - 1] + add;
            }

            else if (common[1] / common[0] == common[2] / common[1]) {
                int multi = common[1] / common[0];
                answer = common[common.length - 1] * multi;
            }

            return answer;
    }
}