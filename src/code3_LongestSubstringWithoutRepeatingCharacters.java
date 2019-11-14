import java.util.HashSet;
import java.util.Set;

/*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。*/
public class code3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> save = new HashSet<>();
        int result = 0,i = 0,j = 0;
        while(i < len && j < len){
            if(!save.contains(s.charAt(j))){
                save.add(s.charAt(j));
                j = j + 1;
                result = Math.max(result , j - i);
            }
            else{
                save.remove(s.charAt(i));
                i = i + 1;
            }
        }
        return result;
    }
}

/**
 * 随笔：这道题目想了很久，是我不会的那种题目。
 * 基本流程如下：首先判断这一位数hashset里有没有，没有的话加1并且和i相减得到长度，j+1，
 * 假如有的话进入i的状态，移除这个元素，i+1其他不变，字符串就成为删除第一个字符的字符串，
 * 一直对比直到set中无重复对象。
 */