import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();

            if (myStr.contains("a") || myStr.contains("b") || myStr.contains("c")) {

                myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
            }

            String[] answer = myStr.split(" ");

            if (answer.length == 0) {
                list.add("EMPTY");
            } else {
                for (String s : answer) {
                    if (!s.equals("")) {
                        list.add(s);
                    }
                }
            }
            return list.toArray(new String[list.size()]);
    }
}