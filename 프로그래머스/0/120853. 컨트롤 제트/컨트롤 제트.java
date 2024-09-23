class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");

        int answer = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("Z")) {
                int numberPrev = Integer.parseInt(strArr[i - 1]);
                answer = answer - numberPrev;
            } else {
                int number = Integer.parseInt(strArr[i]);
                answer += number;
            }
        }
        return answer;
    }
}