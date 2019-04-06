package chapter6.lesson1;

import java.util.Stack;

/**
 * Created by luzhiyuan on 2019/1/7.
 */
public class Solution_Me {

    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                res.push(s.charAt(i));
            }else {
                if(res.size() == 0){
                    return false;
                }

                Character c = res.pop();
                Character match;
                if(s.charAt(i) == ')' ){
                    match = '(';
                }else if(s.charAt(i) == ']' ){
                    match = '[';
                }else {
                    match = '{';
                }

                if(match != c){
                    return false;
                }
            }
        }
        if(res.size() > 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println((new Solution_Me()).isValid(s));
    }
}
