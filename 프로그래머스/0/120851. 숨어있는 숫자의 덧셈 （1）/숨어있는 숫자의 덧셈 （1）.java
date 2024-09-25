class Solution {
    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!(num >= 65 && num <= 90) && !(num >= 97 && num <= 122)) {
                int realNum = num - '0';
                answer = answer + realNum;
            }
        }
        return answer;
    }
}