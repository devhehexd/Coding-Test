class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
            int lengthLimit = myString.length() - pat.length();

            for (int i = 0; i <= lengthLimit; i++) {
                String sub = myString.substring(i, pat.length() + i);
                if (sub.equals(pat)) {
                    count++;
                }
            }
            return count;
    }
}