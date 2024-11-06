import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
        }

        int leftP = 0;
        int rightP = 0;

        int tmpSum = 0;
        int count = 0;

        while (true) {

            if (tmpSum < m) {
                if (rightP == n) {
                    break;
                }
                tmpSum += numbers[rightP];
                rightP++;
            }
            else if (tmpSum > m) {
                tmpSum -= numbers[leftP];
                leftP++;
            }
            else {
                count++;
                tmpSum -= numbers[leftP];
                leftP++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}