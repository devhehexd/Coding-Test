class Solution {
    public int solution(String A, String B) {
        int count = 0;
        
        if (A.equals(B)) return count;

        else {
            for (int i = 1; i < A.length() + 1; i++) {
                String firstChar = String.valueOf(A.charAt(A.length() - 1));
                String rest = A.substring(0, A.length() - 1);
                A = firstChar + rest;
                if (A.equals(B)) {
                    count = i;
                    break;
                } else {
                    count = -1;
                }
            }
        }
        return count;
    }
}