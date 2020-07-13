package 面试.算法.leetcode.Q733图像渲染;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int orign = image[sr][sc];
        fill(image,sr,sc,orign,newColor);
        return image;
    }

    private void fill(int[][] image, int x, int y, int orign, int newColor) {
        if (!inArea(image,x,y)) return;
        // 碰到其他颜色，超出originColor区域
        if (image[x][y]!=orign) return;
        image[x][y] = newColor;
        fill(image, x, y + 1, orign, newColor);
        fill(image, x, y - 1, orign, newColor);
        fill(image, x - 1, y, orign, newColor);
        fill(image, x + 1, y, orign, newColor);
    }

    boolean inArea(int[][] image, int x, int y) {
        return x >= 0 && x < image.length
                && y >= 0 && y < image[0].length;
    }
}
