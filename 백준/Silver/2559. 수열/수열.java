import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sectionSum = 0;
        for (int i = 0; i < k; i++) {
            sectionSum += arr[i];
        }

        int maxNum = sectionSum;
        for (int i = 0; i < n - k; i++) {
            sectionSum = sectionSum - arr[i] + arr[i + k];
            if (maxNum < sectionSum) {
                maxNum = sectionSum;
            }
        }
        bw.write(maxNum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}