import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        
        ArrayList<String> list = new ArrayList<>();

            String[] tmp = myString.split("x");

            for (String s : tmp) {
                if (!s.equals("")) {
                    list.add(s);
                }
            }
            String[] answer = list.toArray(new String[list.size()]);
            Arrays.sort(answer);
            
            return answer;
    }
}