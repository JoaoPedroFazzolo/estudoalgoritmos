package br.com.joaopedrofazzolo.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumLengthSubstringWithTwoOccurrences {
    class Solution {
        public int maximumLengthSubstring(String s) {
            Map<Character, Integer> counter = new HashMap<>();

            int l = 0, r =0;
            int _max = 0;

            while(r < s.length()){
                char c = s.charAt(r);
                counter.put(c, counter.getOrDefault(c, 0) + 1);

                while(counter.get(c) > 2){
                    char leftChar = s.charAt(l);
                    counter.put(leftChar, counter.get(leftChar) - 1);
                    l++;
                }
                _max = Math.max(_max, r -l + 1);
                r++;
            }
            return _max;

        }
    }
}
