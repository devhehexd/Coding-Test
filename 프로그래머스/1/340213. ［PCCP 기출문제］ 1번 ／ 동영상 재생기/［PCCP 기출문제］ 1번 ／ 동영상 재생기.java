class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] video_len_arr = video_len.split(":");
        String[] pos_arr = pos.split(":");
        String[] op_start_arr = op_start.split(":");
        String[] op_end_arr = op_end.split(":");

        int video_len_sec = Integer.parseInt(video_len_arr[0]) * 60 + Integer.parseInt(video_len_arr[1]);
        int pos_sec = Integer.parseInt(pos_arr[0]) * 60 + Integer.parseInt(pos_arr[1]);
        int op_start_sec = Integer.parseInt(op_start_arr[0]) * 60 + Integer.parseInt(op_start_arr[1]);
        int op_end_sec = Integer.parseInt(op_end_arr[0]) * 60 + Integer.parseInt(op_end_arr[1]);

        for (int i = 0; i < commands.length; i++) {

            if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
                pos_sec = op_end_sec;
            }
            if (commands[i].equals("next")) {
                if (video_len_sec - pos_sec <= 10) {
                    pos_sec = video_len_sec;
                } else {
                    pos_sec = pos_sec + 10;
                    if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
                        pos_sec = op_end_sec;
                    }
                }
            } else if (commands[i].equals("prev")) {
                if (pos_sec <= 10) {
                    pos_sec = 0;
                } else {
                    pos_sec = pos_sec - 10;
                    if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
                        pos_sec = op_end_sec;
                    }
                }
            }

        }
        int min_fin = pos_sec / 60;
        int sec_fin = pos_sec % 60;

        String minStr = "";
        String secStr = "";

        if (min_fin >= 0 && min_fin < 10) {
            minStr = "0" + min_fin;
        } else {
            minStr = String.valueOf(min_fin);
        }

        if (sec_fin >= 0 && sec_fin < 10) {
            secStr = "0" + sec_fin;
        } else {
            secStr = String.valueOf(sec_fin);
        }

        return minStr + ":" + secStr;
    }
}