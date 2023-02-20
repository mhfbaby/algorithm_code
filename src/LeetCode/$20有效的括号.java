package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class $20有效的括号 {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                list.add(s.charAt(i));
            }else {
                if (list.size() == 0){
                    return false;
                }
                if ((s.charAt(i) == ')' && list.get(list.size()-1) == '(')
                        || (s.charAt(i) == ']' && list.get(list.size()-1) == '[')
                        || (s.charAt(i) == '}' && list.get(list.size()-1) == '{')){
                    list.remove(list.size()-1);
                }else {
                    return false;
                }

            }
        }
        if (list.size() == 0)
            return true;
        else
            return false;
    }
}
