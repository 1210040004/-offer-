package 面试.算法.牛客.栈的压入弹出序列;
import javax.swing.*;
import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）、
 *
 * 新建一个栈，将数组A压入栈中，当栈顶元素等于数组B时，就将其出栈，当循环结束时，判断栈是否为空，若为空则返回true.
 */
public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
       int j = 0;
       Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek()== popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushA =new int[]{1,2,3,4,5};
        int[] popA = new int[]{4,5,3,2,1};
        System.out.println(IsPopOrder(pushA, popA));
    }
}
/**
 * 1 2 3 4 5是压入顺序
 *
 */
