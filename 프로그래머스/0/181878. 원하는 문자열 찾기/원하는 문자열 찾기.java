class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        if (pat.length() > myString.length()) {
            answer = 0;
        } else {
            char[] myStringChar = myString.toLowerCase().toCharArray();
            char[] patChar = pat.toLowerCase().toCharArray();
            int length = patChar.length;
            for (int i = 0; i + length <= myStringChar.length; i++) {
                boolean flag = false;
                for (int j = i; j < i + length; j++) {
                    if (myStringChar[j] != patChar[j - i]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}