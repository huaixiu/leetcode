
/*���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ����?(i,?ai) ��
�������ڻ� n ����ֱ�ߣ���ֱ�� i?�������˵�ֱ�Ϊ?(i,?ai) �� (i, 0)���ҳ����е������ߣ�ʹ��������?x?�Ṳͬ���ɵ�����������������ˮ��
˵�����㲻����б��������?n?��ֵ����Ϊ 2��*/

public class code11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxarea;
    }
}
