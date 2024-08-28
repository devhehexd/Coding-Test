class Solution {
    public int solution(int order) {
        int answer = 0;

        String[] threeSixNine = {"3", "6", "9"};
        
        String str = String.valueOf(order);
        
        for (int i = 0; i < threeSixNine.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals(threeSixNine[i])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}