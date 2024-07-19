class Solution {
    public int solution(String myString, String pat) {
        
        int answer = 0;

        if (pat.length() > myString.length()) {
            answer = 0;
       } else {
              
        for (int i = 0; i < myString.length(); i++) {
                int lastNum = pat.length() + i;
                String tmp = "";
                if (i <= myString.length() - pat.length()) {
                    tmp = myString.substring(i, lastNum);
                }
                if (lastNum <= myString.length() && tmp.equalsIgnoreCase(pat)) {
                    answer = 1;
                    break;
                }
            }
    }
        return answer;
}
}