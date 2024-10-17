import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split("X");
            int sum = 0;
            for (int j = 0; j < strArr.length; j++) {
                for (int k = 0; k < strArr[j].length(); k++) {
                    sum += k + 1;
                }
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}