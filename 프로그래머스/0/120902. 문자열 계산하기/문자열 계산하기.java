class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] strArr = my_string.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("-")) {
                strArr[i + 1] = "-" + strArr[i + 1];
            }
        }
        
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("+") && !strArr[i].equals("-")) {
                int num = Integer.parseInt(strArr[i]);
                answer = answer + num;
            }
        }
        return answer;
    }
}