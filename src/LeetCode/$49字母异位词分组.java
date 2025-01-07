package LeetCode;

import java.util.*;

public class $49字母异位词分组 {
    public static void main(String[] args) {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(strings[1]);
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> stringListMap = new HashMap<>();


        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (stringListMap.containsKey(key)){
                List<String> stringList = stringListMap.get(key);
                stringList.add(s);
                stringListMap.put(key,stringList);
            }else {
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                stringListMap.put(key,stringList);
            }
        }

        return new ArrayList<List<String>>(stringListMap.values());
    }

}
