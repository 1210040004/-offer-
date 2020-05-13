package 面试.算法.leetcode.Q416分割等和字符串;

/**
 *
 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。

 注意:

 每个数组中的元素不会超过 100
 数组的大小不会超过 200
 示例 1:

 输入: [1, 5, 11, 5]

 输出: true

 解释: 数组可以分割成 [1, 5, 5] 和 [11].
  

 示例 2:

 输入: [1, 2, 3, 5]

 输出: false

 解释: 数组不能分割成两个元素和相等的子集.

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/partition-equal-subset-sum
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
        public boolean canPartition(int[] nums) {
            //1dfs
            //2 dp
            // 前i个物品，重量为j
            //01 背包问题只能放进一个
            if(nums ==null || nums.length==0){
                return true;
            }
            int sum =0;
            for(int num: nums){
                sum+=num;
            }
            if(sum%2!=0){
                return false;
            }
            sum/=2;
            boolean[] dp  = new boolean[sum+1];
            dp[0] = true;
            for(int i =1 ;i<nums.length;i++){
                int w =nums[i-1];
                for(int j=sum;j>=w;j--){
                    dp[j]=dp[j] ||dp[j-w];
                }
            }
            return dp[sum];
        }
}
