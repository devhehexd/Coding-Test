class Solution {
    public String solution(String myString) {
        
        String[] answer = myString.split("");
        
        for (int i = 0; i < myString.length(); i++) {
                if (answer[i].equals("a")) {
                    answer[i] = answer[i].toUpperCase();
                } else if (answer[i].equals("A")) {
                    continue;
                } else {
                    answer[i] = answer[i].toLowerCase();
                } 
            }
            return String.join("", answer);
    }
}