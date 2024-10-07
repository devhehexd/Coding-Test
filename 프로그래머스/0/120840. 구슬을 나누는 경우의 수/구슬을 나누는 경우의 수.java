import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger bigDenominator = new BigInteger("1");
        BigInteger bigNumerator1 = new BigInteger("1");
        BigInteger bigNumerator2 = new BigInteger("1");

        for (int i = 1; i <= balls; i++) {
            String num = String.valueOf(i);
            bigDenominator = bigDenominator.multiply(new BigInteger(num));
        }

        for (int i = 1; i <= balls - share; i++) {
            String num = String.valueOf(i);
            bigNumerator1 = bigNumerator1.multiply(new BigInteger(num));
        }

        for (int i = 1; i <= share; i++) {
            String num = String.valueOf(i);
            bigNumerator2 = bigNumerator2.multiply(new BigInteger(num));
        }

        return bigDenominator.divide((bigNumerator1.multiply(bigNumerator2))).intValue();
    }
}