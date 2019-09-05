
/*����һ���ַ���s��һ���ַ�����p��������ʵ��һ��֧�� '.'��'*'��������ʽƥ�䡣
  '.' ƥ�����ⵥ���ַ�
  '*' ƥ���������ǰ�����һ��Ԫ��
  ��νƥ�䣬��Ҫ���������ַ���s�ģ������ǲ����ַ�����
  ˵��:
  s����Ϊ�գ���ֻ������a-z��Сд��ĸ��
  p����Ϊ�գ���ֻ������a-z��Сд��ĸ���Լ��ַ�.��*��*/

public class code10_RegularExpressionMatching {
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}
