import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            String[] strings = new String[k];
            for (int j = 0; j < k; j++) {
                strings[j] = br.readLine();
            }

            boolean flag = false;
            String answer = "0";
            for (int m = 0; m < strings.length; m++) {
                for (int p = 0; p < strings.length; p++) {
                    if (p == m) {
                        continue;
                    }
                    String word = strings[m] + strings[p];

                    if (isPelindrome(word)) {
                        flag = true;
                        answer = word;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            bw.write(answer);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }

    public static boolean isPelindrome(String s) {
        int left_p = 0;
        int right_p = s.length() - 1;

        while(left_p < right_p) {
            if (s.charAt(left_p) != s.charAt(right_p)) {
                return false;
            }

            left_p += 1;
            right_p -= 1;
        }
        return true;
    }
}