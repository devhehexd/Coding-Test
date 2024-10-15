class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;

        while (true) {

            int pizzaTotal = 6 * pizza;

            if (pizzaTotal % n == 0) {
                answer = pizzaTotal / n;
                break;
            }
            pizza++;

        }
        return pizza;
    }
}