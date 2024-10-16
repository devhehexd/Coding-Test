class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int denom3 = 0;

        if (denom1 % denom2 == 0 || denom2 % denom1 == 0) {
            if (denom1 > denom2) {
                denom3 = denom1;
            } else {
                denom3 = denom2;
            }
        } else if (denom1 % denom2 != 0 && denom2 % denom1 != 0) {
            denom3 = denom1 * denom2;
        }

        int numTmpA = numer1 * (denom3 / denom1);
        int numTmpB = numer2 * (denom3 / denom2);

        int numer3 = numTmpA + numTmpB;

        int value = 0;
        if (denom3 > numer3) {
            value = gcd(denom3, numer3);
            answer[0] = numer3 / value;
            answer[1] = denom3 / value;
        }
        else {
            value = gcd(numer3, denom3);
            answer[0] = numer3 / value;
            answer[1] = denom3 / value;
        }
        return answer;
    }

    public int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }
}