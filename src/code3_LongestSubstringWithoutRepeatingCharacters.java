import java.util.HashSet;
import java.util.Set;

/*
* 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
* */
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
