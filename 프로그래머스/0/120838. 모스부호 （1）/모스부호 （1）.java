import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Map<String, Character> alphabet = new HashMap<>();

        for (int i = 0; i < morse.length; i++) {
            char lowerCaseLetter = (char) ('a' + i);
            alphabet.put(morse[i], lowerCaseLetter);
        }
        String[] arr = letter.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (alphabet.containsKey(arr[i])) {
                sb.append(alphabet.get(arr[i]));
            }
        }
        return sb.toString();
    }
}