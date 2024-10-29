import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
//        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st1.nextToken());
            set.add(num);
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            int num = Integer.parseInt(st2.nextToken());

            if (set.contains(num)){
                bw.write("1");
                bw.newLine();
            }
            else {
                bw.write("0");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
