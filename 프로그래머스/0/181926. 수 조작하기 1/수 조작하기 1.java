class Solution {
    public int solution(int n, String control) {
        int answer = n;

        char[] arr = control.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'w') {
                n += 1;
            } else if (arr[i] == 's') {
                n -= 1;
            } else if (arr[i] == 'd') {
                n += 10;
            } else {
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}