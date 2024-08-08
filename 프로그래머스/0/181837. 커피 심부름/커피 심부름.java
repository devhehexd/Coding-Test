class Solution {
    public int solution(String[] order) {
        int sum = 0;

            for (String s : order) {
                if (s.contains("americano")) {
                    sum += 4500;
                    continue;
                }
                if (s.contains("latte")) {
                    sum += 5000;
                    continue;
                }
                if (s.contains("americano") && (s.contains("ice") || s.contains("hot"))) {
                    sum += 4500;
                    continue;
                }
                if (s.contains("latte") && (s.contains("ice") || s.contains("hot"))) {
                    sum += 5000;
                    continue;
                }
                if (s.contains("anything")) {
                    sum += 4500;
                    continue;
                }
            }
            return sum;
    }
}