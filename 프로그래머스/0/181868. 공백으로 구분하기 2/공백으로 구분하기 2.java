import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> list = new ArrayList<>();

            String[] tmp = my_string.split(" ");

            for (String s : tmp) {
                if (!s.equals("")) {
                    list.add(s);
                }
            }
            return list.toArray(new String[list.size()]);
    }
}