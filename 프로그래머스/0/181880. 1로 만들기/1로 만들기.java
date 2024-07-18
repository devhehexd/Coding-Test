import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
    
        int[] tmp = Arrays.copyOf(num_list, num_list.length);

        int changeCounter = 0;

        while (true) {

            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] % 2 == 0) {
                    tmp[i] /= 2;
                    changeCounter++;
                }
                if (tmp[i] % 2 != 0 && tmp[i] != 1) {
                    tmp[i] = (tmp[i] - 1) / 2;
                    changeCounter++;
                }
            }

            int oneCounter = 0;
            for (int i : tmp) {
                oneCounter += i;
            }

            if (oneCounter == num_list.length) {
                break;
            }
        }
        return changeCounter;
    }
}