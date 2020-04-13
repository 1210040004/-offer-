package 面试.算法.leetcode.Q79wordsearch;

public class Solution2 {
    boolean flag = false;
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length ==0){
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (isTruePath(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isTruePath(char[][] board,int i ,int j,String word,int index){
        if (index==word.length()){
            flag=true;
            return flag;
        }
        if (i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(index)!=board[i][j]){
            return false;
        }
        if (!flag){
            char c = board[i][j];
            board[i][j]='.';
            boolean shang = isTruePath(board, i -1, j, word, index + 1);
            boolean you = isTruePath(board, i,j+1 , word, index + 1);
            boolean xia = isTruePath(board, i+1, j, word, index + 1);
            boolean zuo = isTruePath(board, i, j-1, word, index + 1);
            board[i][j]=c;
            return shang || you || xia || zuo;
        }
        else {
            return true;
        }
    }
}
