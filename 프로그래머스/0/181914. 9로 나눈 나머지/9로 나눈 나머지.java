class Solution {
    public int solution(String number) {
       char[] charArr = number.toCharArray();

        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
            sum += Character.getNumericValue(charArr[i]);
        }
        int answer = sum % 9;
        return answer;
    }
}