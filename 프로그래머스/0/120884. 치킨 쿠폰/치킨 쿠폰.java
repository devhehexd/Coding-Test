class Solution {
    public int solution(int chicken) {
        int couponLeftOver = 0;
        int chickenForServiceTotal = 0;

        do {
            chickenForServiceTotal += (int) Math.floor(chicken / 10);
            couponLeftOver += chicken % 10;
            chicken = (int) Math.floor(chicken/ 10);
        }
        while ((int) Math.floor(chicken / 10) > 0);

        couponLeftOver += chicken % 10;

        if (couponLeftOver >= 10) {
            if ((int) Math.floor(couponLeftOver / 10) + couponLeftOver % 10 >= 10) {
                chickenForServiceTotal++;
            }
            chickenForServiceTotal += (int) Math.floor(couponLeftOver / 10);
        }

        return chickenForServiceTotal;
    }
}