package 面试.算法.leetcode.Q735恒星碰撞;

import java.util.Stack;

public class Solution {
    /**
     * 对于数组中的每一个元素，其绝对值表示行星的大小，正负表示行星的移动方向
     * （正表示向右移动，负表示向左移动）。每一颗行星以相同的速度移动。
     * 找出碰撞后剩下的所有行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。
     * 如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。
     * @param asteroids
     * @return
     */
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int t : asteroids) {
            if (stack.isEmpty()){
                stack.add(t);
                continue;
            }

        }
        return asteroids;
    }
}
