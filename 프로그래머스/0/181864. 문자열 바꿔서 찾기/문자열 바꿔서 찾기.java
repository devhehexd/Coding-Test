class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
            String newStr = "";

            String[] tmp = myString.split("");

            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i].equals("A")) {
                    tmp[i] = "B";
                    newStr += tmp[i];
                } else if (tmp[i].equals("B")) {
                    tmp[i] = "A";
                    newStr += tmp[i];
                }
            }

            if (newStr.contains(pat)) {
                answer = 1;
            }
            else answer = 0;
            
            return answer;
    }
}