package 面试.算法.leetcode.Q79wordsearch;

public class Solution3 {
     static boolean flag = false;
    public static boolean exist(char[][] board, String word) {
         if (board==null || board.length==0 || board[0].length==0){
             return  false;
         }
         if (word==null || word.length()==0){
             return true;
         }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (findTruePath(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findTruePath(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()){
            flag = true;
            return true;
        }
        if (i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        if (!flag){
            char c = board[i][j];
            board[i][j]='.';
            boolean shang = findTruePath(board,i-1,j,word,index+1);
            boolean xia = findTruePath(board,i+1,j,word,index+1);
            boolean zuo = findTruePath(board,i,j-1,word,index+1);
            boolean you = findTruePath(board,i,j+1,word,index+1);
            board[i][j] = c;
            return shang|| xia|| zuo||you;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        char[][] grid={
                {'A','B','C', 'E'},{'S','F','C','S'},{'A','D','E','E'}
        };
        boolean see = exist(grid, "SEE");
        System.out.println(see);

    }
}
