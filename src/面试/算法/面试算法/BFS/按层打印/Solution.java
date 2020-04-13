package 面试.算法.面试算法.BFS.按层打印;

public class Solution {
//    public void printTree(BinaryNode<T> root){
//        if(root == null)
//            return;
//        Queue<BinaryNode<T>> queue = new LinkedList<>();
//
//        int current;//当前层 还未打印的结点个数
//        int next;//下一层结点个数
//
//        queue.offer(root);
//        current = 1;
//        next = 0;
//        while(!queue.isEmpty()){
//            BinaryNode<T> currentNode = queue.poll();
//            System.out.printf("%-4d", currentNode.element);
//            current--;
//
//            if(currentNode.left != null){
//                queue.offer(currentNode.left);
//                next++;
//            }
//            if(currentNode.r ight != null){
//                queue.offer(currentNode.right);
//                next++;
//            }
//            if(current ==0){
//                System.out.println();
//                current = next;
//                next = 0;
//            }
//        }
//    }
}
