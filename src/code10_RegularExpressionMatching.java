
/*给你一个字符串s和一个字符规律p，请你来实现一个支持 '.'和'*'的正则表达式匹配。
  '.' 匹配任意单个字符
  '*' 匹配零个或多个前面的那一个元素
  所谓匹配，是要涵盖整个字符串s的，而不是部分字符串。
  说明:
  s可能为空，且只包含从a-z的小写字母。
  p可能为空，且只包含从a-z的小写字母，以及字符.和*。*/

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
