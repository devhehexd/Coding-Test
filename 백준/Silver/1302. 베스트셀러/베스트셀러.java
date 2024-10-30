import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String bookName = br.readLine();
            map.put(bookName, map.getOrDefault(bookName, 0) + 1);
        }

        String answer = "";
        int sold = 0;
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);

        for (String bookName : map.keySet()) {
            if (map.get(bookName) > sold) {
                sold = map.get(bookName);
                answer = bookName;
            } else if (map.get(bookName) == sold) {
                answer = comparator.compare(bookName, answer) < 0 ? bookName : answer;
            }
        }
        bw.write(answer);
        bw.flush();
        br.close();
        bw.close();
    }
}