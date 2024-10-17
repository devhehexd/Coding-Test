import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            map.put(str1, str2);
        }
        for (String s : map.keySet()) {
            if (map.get(s).equals("enter")) {
                list.add(s);
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        br.close();
        bw.flush();
    }
}