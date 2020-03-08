package Q6旋转数组的最小数字;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/9f3231a991af4f55b95579b44b7a01ba?f=discussion
 * 来源：牛客网
 *
 * 采用二分法解答这个问题，
 * mid = low + (high - low)/2
 * 需要考虑三种情况：
 * (1)array[mid] > array[high]:
 * 出现这种情况的array类似[3,4,5,6,0,1,2]，此时最小数字一定在mid的右边。
 * low = mid + 1
 * (2)array[mid] == array[high]:
 * 出现这种情况的array类似 [1,0,1,1,1] 或者[1,1,1,0,1]，此时最小数字不好判断在mid左边
 * 还是右边,这时只好一个一个试 ，
 * high = high - 1
 * (3)array[mid] < array[high]:
 * 出现这种情况的array类似[2,2,3,4,5,6,6],此时最小数字一定就是array[mid]或者在mid的左
 * 边。因为右边必然都是递增的。
 * high = mid
 * 注意这里有个坑：如果待查询的范围最后只剩两个数，那么mid 一定会指向下标靠前的数字
 * 比如 array = [4,6]
 * array[low] = 4 ;array[mid] = 4 ; array[high] = 6 ;
 * 如果high = mid - 1，就会产生错误， 因此high = mid
 * 但情形(1)中low = mid + 1就不会错误
 */
public class Solution {
    public static int minNumberInRotateArray(int [] array) {
        // 应该用二分法来去处理
        if (array.length == 0) {
            return 0;
        }
        int left =0 ;
        int right = array.length-1;
        while(left < right ){
            int mid = left + (right-left)/2;
            if(array[mid]>array[right]){
                left =mid+1;
            }
            else if(array[mid] == array[right]){
                right--;
            }
            else {
                right = mid ;
            }
        }
        return array[left];
    }

    public static void main(String[] args) {
        int[] arr= new int[]{6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
        minNumberInRotateArray(arr);
    }
}