import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();

        int threeXNumber = 1;
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(threeXNumber);
            if (str.contains("3") || threeXNumber % 3 == 0) {
                i--;
            }
            else {
                list.add(threeXNumber);
            }
            threeXNumber++;;
        }
        return list.get(n - 1);
    }
}