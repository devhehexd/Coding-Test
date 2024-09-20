class Solution {
    public int solution(String my_string) {
        for (int i = 0; i < my_string.length(); i++) {
            int asciiNum = my_string.charAt(i);

            if (asciiNum >= 65 && asciiNum <= 90 || asciiNum >= 97 && asciiNum <= 122) {
                my_string = my_string.replace(my_string.charAt(i), ' ');
            }
        }

        String[] strArr = my_string.split(" ");

        int answer = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("")) {
            int number = Integer.parseInt(strArr[i]);
            answer += number;
            }
        }
        return answer;
    }
}