class Solution {
    public int[] solution(int num, int total) {

            int[] answer = new int[num];

            int criteria = total / num;

            if (num % 2 != 0) {
                int criteriaIndex = (num - 1) / 2;
                answer[criteriaIndex] = criteria;

                int critMinus = criteria;
                int critPlus = criteria;

                for (int i = criteriaIndex - 1; i >= 0; i--) {
                    answer[i] = --critMinus;
                }
                for (int i = criteriaIndex + 1; i < num; i++) {
                    answer[i] = ++critPlus;
                }
            } else {

                int criteriaIndex = (total % num) - 1;
                answer[criteriaIndex] = criteria;

                int critMinus = criteria;
                int critPlus = criteria;

                for (int i = criteriaIndex - 1; i >= 0; i--) {
                    answer[i] = --critMinus;
                }
                for (int i = criteriaIndex + 1; i < num; i++) {
                    answer[i] = ++critPlus;
                }

            }
            return answer;
    }
}