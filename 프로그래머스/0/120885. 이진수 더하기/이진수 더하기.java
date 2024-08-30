class Solution {
    public String solution(String bin1, String bin2) {
        int decimalNum1 = 0;
        int decimalNum2 = 0;

        int exponent1 = bin1.length() - 1;
        int exponent2 = bin2.length() - 1;

        for (int i = 0; i < bin1.length(); i++) {
            if (bin1.charAt(i) == '1') {
                decimalNum1 += Math.pow(2, exponent1);
            }
            exponent1--;
        }

        for (int i = 0; i < bin2.length(); i++) {
            if (bin2.charAt(i) == '1') {
                decimalNum2 += Math.pow(2, exponent2);
            }
            exponent2--;
        }
        
        int decimalSum = decimalNum1 + decimalNum2;

        return Integer.toBinaryString(decimalSum);
    }
}