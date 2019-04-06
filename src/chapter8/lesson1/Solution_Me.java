package chapter8.lesson1;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by luzhiyuan on 2019/1/8.
 */
public class Solution_Me {
    private String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };
    private ArrayList<String> res;

    public List<String> letterCombinations(String digits) {
        res = new ArrayList<String>();

        if(digits.equals(""))
            return res;

        findCombination(digits, 0, "");
        return res;
    }

    // s中保存了此时从digits[0...index-1]翻译得到的一个字母字符串
    // 寻找和digits[index]匹配的字母, 获得digits[0...index]翻译得到的解
    private void findCombination(String digits, int index, String s){
        if(index == digits.length()){
            res.add(s);
            return;
        }
        //取出传入的数字
        Character c = digits.charAt(index);
        //判断该数字是否在（1，9]
        assert  c.compareTo('0') >= 0 &&
                c.compareTo('9') <= 0 &&
                c.compareTo('1') != 0;
        //该数字代表的字母，如“abc”
        String letters = letterMap[c - '0'];

        for(int i =0 ;i<letters.length() ; i++){
            findCombination(digits, index+1, s + letters.charAt(i));
        }
        return;
    }
}
