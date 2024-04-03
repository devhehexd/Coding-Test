import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = add(a, b);
        System.out.println(a + " + " + b + " = " + answer);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}