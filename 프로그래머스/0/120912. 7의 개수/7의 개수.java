class Solution {
    public int solution(int[] array) {
        
        StringBuilder sb = new StringBuilder();

        for (int i : array) {
            String s = String.valueOf(i);
            sb.append(s);
        }
        
        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '7') {
                count++;
            }
        }
        return count;
    }
}