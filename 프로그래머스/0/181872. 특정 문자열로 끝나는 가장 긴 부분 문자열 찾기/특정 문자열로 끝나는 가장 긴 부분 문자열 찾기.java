class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
            int patLength = pat.length();
            int myStringLength = myString.length();

            for (int i = myStringLength - 1; i >= 0; i--) {
                String sub = myString.substring(0, i + 1);
                if (sub.endsWith(pat)) {
                    answer = sub;
                    break;
                }
            }
            return answer;
    }
}