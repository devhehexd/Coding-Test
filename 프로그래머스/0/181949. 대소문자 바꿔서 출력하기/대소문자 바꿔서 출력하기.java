import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
       char[] arr = a.toCharArray();

        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(arr[i])) {
                char lowerCase = Character.toLowerCase(arr[i]);
                System.out.print(lowerCase);
            } else if (Character.isLowerCase(arr[i])) {
                char upperCase = Character.toUpperCase(arr[i]);
                System.out.print(upperCase);
            }

        }
    }
}
