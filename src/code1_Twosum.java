/*
 * ����һ���������� nums��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ�����������������������ǵ������±ꡣ
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
 */

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
