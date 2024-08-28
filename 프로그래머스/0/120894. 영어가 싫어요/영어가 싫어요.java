class Solution {
    public long solution(String numbers) {
        String[] arr = new String[10];

        arr[0] = "zero";
        arr[1] = "one";
        arr[2] = "two";
        arr[3] = "three";
        arr[4] = "four";
        arr[5] = "five";
        arr[6] = "six";
        arr[7] = "seven";
        arr[8] = "eight";
        arr[9] = "nine";

        for (int i = 0; i <= 9; i++) {
            numbers = numbers.replace(arr[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}