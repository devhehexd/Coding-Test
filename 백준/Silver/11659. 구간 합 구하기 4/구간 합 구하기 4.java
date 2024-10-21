import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");

        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> accList = new ArrayList<>();
        accList.add(0);

        int sum = 0;
        for (int num : arr) {
            sum += num;
            accList.add(sum);
        }

        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            bw.write((accList.get(j) - accList.get(i - 1)) + "\n");
            bw.flush();
        }
        bw.newLine();
        br.close();
    }
}