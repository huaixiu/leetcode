
/*给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。

注意：

答案中不可以包含重复的四元组。*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        //先排序
        Arrays.sort(nums);

        for (int i = 0;i < nums.length - 2;i ++) {
            // 去除指针i可能的重复情况
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i + 1;j < nums.length;j ++) {
                // 去除j可能重复的情况
                if (j != i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length -1;

                while (left < right) {
                    // 不满足条件或者重复的，继续遍历
                    if ((left != j + 1 && nums[left] == nums[left-1]) || nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left ++;
                    } else if ((right != nums.length -1 && nums[right] == nums[right + 1]) || nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        right --;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);

                        result.add(list);
                        // 满足条件的，进入下一次遍历
                        left ++;
                        right --;
                    }
                }

            }
        }

        return result;
    }
}
/**
 * diary：今日翻造爆表 今日随意看了几眼
 */