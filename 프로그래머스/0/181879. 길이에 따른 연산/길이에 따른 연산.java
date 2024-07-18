class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int tmp = 1;

        if (num_list.length >= 11) {
            for (int i : num_list) {
                sum += i;
            }
            return sum;
        } else if (num_list.length <= 10) {
            for (int i : num_list) {
                tmp *= i;
            }
            sum = tmp;
        }
        return sum;
    }
}