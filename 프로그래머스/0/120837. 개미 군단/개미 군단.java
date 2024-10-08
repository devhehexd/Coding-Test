class Solution {
    public int solution(int hp) {
        int antCount = 0;

        while (true) {

            if (hp - 5 >= 0) {
                hp = hp - 5;
                antCount++;
            } else if (hp - 5 < 0) {
                if (hp - 3 >= 0) {
                    hp = hp - 3;
                    antCount++;
                }
                else if (hp - 3 < 0) {
                    if (hp - 1 >= 0) {
                        hp = hp - 1;
                        antCount++;
                    }
                }
            }
            if (hp == 0) {
                break;
            }
        }
        return antCount;
    }
}