package 面试.算法.leetcode.Q79wordsearch;

public class Solution {
    private boolean flag= false;
    public boolean exist(char[][] board, String word) {
        if (board==null || board.length==0 ||board[0].length==0){
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (DFS(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean DFS(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()){
            flag =true;
            return true;
        }
        if (i<0 || i>=board.length || j<0 ||j>=board[0].length || word.charAt(index)!=board[i][j]){
            return false;
        }
        if (!flag){
        char c = board[i][j];
        board[i][j]='.';
        boolean ret1 = DFS(board, i + 1, j, word, index + 1);
        boolean ret2 = DFS(board, i - 1, j, word, index + 1);
        boolean ret3 = DFS(board, i, j + 1, word, index + 1);
        boolean ret4 = DFS(board, i, j - 1, word, index + 1);
        board[i][j] = c;
        return ret1 || ret2 || ret3 || ret4;
        }
        else {
            return true;
        }
    }
}
