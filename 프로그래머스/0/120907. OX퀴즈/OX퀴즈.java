class Solution {
    public String[] solution(String[] quiz) {
        String equalSign = " = ";

        for (int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(equalSign);
            if (tmp[0].contains("+")) {
                String[] plusTmp = tmp[0].split(" \\+ ");
                int result = Integer.parseInt(plusTmp[0]) + Integer.parseInt(plusTmp[1]);
                if ((result == Integer.parseInt(tmp[1]))) {
                    quiz[i] = "O";
                } else {
                    quiz[i] = "X";
                }
            }
            else if (tmp[0].contains(" - ")) {
                String[] minusTmp = tmp[0].split(" - ");
                int result = Integer.parseInt(minusTmp[0]) - Integer.parseInt(minusTmp[1]);
                if ((result == Integer.parseInt(tmp[1]))) {
                    quiz[i] = "O";
                } else {
                    quiz[i] = "X";
                }
            }
        }
        return quiz;
    }
}