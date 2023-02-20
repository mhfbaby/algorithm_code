package LeetCode;

//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

import java.util.HashMap;
import java.util.Map;

public class $3无重复字符的最长子串 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
