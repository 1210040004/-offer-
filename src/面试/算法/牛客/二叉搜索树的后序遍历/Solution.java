package 面试.算法.牛客.二叉搜索树的后序遍历;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null|| sequence.length==0){
            return false;
        }
        if (sequence.length<=2){
            return true;
        }
        return findTrueBst(sequence,0,sequence.length-1);
    }

    private boolean findTrueBst(int[] sequence, int start, int end) {
        if (start>=end){
            return true;
        }
        int i= start;
        while(sequence[i]<sequence[end]){
            i++;
        }
        int j = i;
        while(j<end){
            if (sequence[j]<sequence[end]){
                return false;
            }
            j++;
        }
        return findTrueBst(sequence,start,i-1) && findTrueBst(sequence,i,end-1);
    }
}
