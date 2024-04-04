class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        char[] arrTotal = new char[arr1.length + arr2.length];

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < arr1.length; i++) {
            arrTotal[i * 2] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrTotal[(i * 2) + 1] = arr2[i];
        }
        for (char c : arrTotal) {
            sb.append(c);
        }
        answer = sb.toString();
        
        return answer;
    }
}