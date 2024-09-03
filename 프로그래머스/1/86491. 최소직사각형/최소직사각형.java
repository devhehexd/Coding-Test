class Solution {
    public int solution(int[][] sizes) {
        int width = 0; //가로
        int height = 0; //세로

        for (int i = 0; i < sizes.length; i++) {
            width = Math.max(width, Math.max(sizes[i][0], sizes[i][1]));
            height = Math.max(height, Math.min(sizes[i][0], sizes[i][1]));
        }
        return width * height;
    }
}