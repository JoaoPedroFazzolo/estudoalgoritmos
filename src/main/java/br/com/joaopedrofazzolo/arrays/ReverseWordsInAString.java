package br.com.joaopedrofazzolo.arrays;

public class ReverseWordsInAString {
    class Solution {
        public String reverseWords(String s) {
            char[] pharse = s.toCharArray();
            int l = 0, r = 0, i = 0;

            while (i <= pharse.length){
                if(i == pharse.length || pharse[i] == ' '){
                    char temp = pharse[l];
                    pharse[l] = pharse[r-1];
                    pharse[r-1] = temp;
                    r--;
                    l++;
                    if(r <= l){
                        if (i != pharse.length){
                            pharse[i] = ' ';
                        }
                        i++;
                        l = i;
                        r = i;
                    }
                }else {
                    r++;
                    i++;
                }
            }
            return String.valueOf(pharse);
        }
    }
}
