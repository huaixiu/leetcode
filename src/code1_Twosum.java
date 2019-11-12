/*给定一个整数数组 nums 和一个目标值 target，
  请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
  你可以假设每种输入只会对应一个答案。
  但是，你不能重复利用这个数组中同样的元素。*/

public class code1_Twosum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for (int  j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

/**
 * 随笔：题目不难，判断边界条件如下:
 * 是否只有一个数字，这个数字是否正好等于所求数字，不是的话return false；
 * 是否为空，为空的话直接return false；
 * 流程如下：
 * 从第一个数字往后，从第二个数字往后，两位数字加起来是否等于所求数字。不是的话先J+1到极限
 * 直到找到对应的I J两个数，然后把它们存进数组，返回一个数组。
 */