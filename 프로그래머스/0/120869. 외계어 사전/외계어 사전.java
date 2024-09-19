class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        for (int i = 0; i < dic.length; i++) {
            int counter = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    counter++;
                }
            }
            if (counter == spell.length) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}