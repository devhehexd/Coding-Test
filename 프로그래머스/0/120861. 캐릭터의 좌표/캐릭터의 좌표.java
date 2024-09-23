class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] start = new int[2];

        int leftLimit = board[0] / 2 * -1;
        int rightLimit = board[0] / 2 * 1;
        int upLimit = board[1] / 2 * 1;
        int downLimit = board[1] / 2 * -1;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                start[0] = start[0] - 1;
                if (start[0] < leftLimit) {
                    start[0] = start[0] + 1;
                }
            }
            if (keyinput[i].equals("right")) {
                start[0] = start[0] + 1;
                if (start[0] > rightLimit) {
                    start[0] = start[0] - 1;
                }
            }
            if (keyinput[i].equals("up")) {
                start[1] = start[1] + 1;
                if (start[1] > upLimit) {
                    start[1] = start[1] - 1;
                }
            }
            if (keyinput[i].equals("down")) {
                start[1] = start[1] - 1;
                if (start[1] < downLimit) {
                    start[1] = start[1] + 1;
                }
            }
        }
        return start;
    }
}