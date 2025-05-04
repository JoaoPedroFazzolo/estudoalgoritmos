package br.com.joaopedrofazzolo.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    class Solution {
        public int firstUniqChar(String s) {
            Map<Character, int[]> map = new LinkedHashMap<>();

            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(!map.containsKey(ch)){
                    map.put(ch, new int[]{i, 1});
                } else{
                    map.get(ch)[1]++;
                }
            }

            for(Map.Entry<Character, int[]> entry : map.entrySet()){
                if(entry.getValue()[1] == 1){
                    return entry.getValue()[0];
                }
            }
            return -1;
        }
    }
}
