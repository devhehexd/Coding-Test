import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalOfNine = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
            totalOfNine += n;
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (totalOfNine - (list.get(i) + list.get(j)) == 100) {
                    for (int height : list) {
                        if (height == list.get(i) || height == list.get(j)) {
                            continue;
                        }
                        bw.write(String.valueOf(height));
                        bw.newLine();
                        count++;
                    }
                }
            }
            if (count == 7) {
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}