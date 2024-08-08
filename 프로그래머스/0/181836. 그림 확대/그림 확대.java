import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < picture.length; i++) {
                String kLoop = "";
                for (int j = 0; j < picture[i].length(); j++) {
                    for (int m = 0; m < k; m++) {
                        kLoop += picture[i].charAt(j);
                    }
                }
                picture[i] = kLoop;
            }

            for (int i = 0; i < picture.length; i++) {
                for (int j = 0; j < k; j++) {
                    list.add(picture[i]);
                }
            }
            return list.toArray(new String[list.size()]);
    }
}