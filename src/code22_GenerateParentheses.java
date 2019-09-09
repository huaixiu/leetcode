
/*给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。*/

import java.util.ArrayList;
import java.util.List;

public class code22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        String str=new String("(");//初始字符必定是左括号
        find(list,str,2*n-1,1);   //只剩下2*n-1个符号需要排列位置
        return list;
    }
    /*
     *s为中途未完成的字符串
     *n为需要添加的字符个数
     *num为s中左括号大于右括号的个数
     */
    public void find(List list,String s,int n,int num)
    {
        if(n==0)
        {
            list.add(s);
            return;
        }
        if(n>=num+2&&num>=1)  //当剩余还需添加字符数大于左括号num+2且num>=1时，下一个添加的符号可以为左或者右括号
        {
            find(list,s+"(",n-1,num+1);
            find(list,s+")",n-1,num-1);
        }
        else if(num==0)       //当num==0，说明此时左括号右括号数量相等，此时只能添加左括号
            find(list,s+"(",n-1,num+1);
        else//此步说明n<num+2,说明此时剩余添加的字符的个数除去还需匹配的num个右括号后还剩<2个（为0个，即n==num，剩下的全部用于添加右括号）
            find(list,s+")",n-1,num-1);
    }
}
