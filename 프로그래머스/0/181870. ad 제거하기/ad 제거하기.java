import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> list = new ArrayList<>(Arrays.asList(strArr));

            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (str.contains("ad")) {
                    list.remove(i);
                    i--;
                }
            }
            return list.toArray(new String[list.size()]);
    }
}