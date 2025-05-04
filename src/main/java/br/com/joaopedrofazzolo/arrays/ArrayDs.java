package br.com.joaopedrofazzolo.arrays;

import java.util.List;

public class ArrayDs {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int left = 0;
        int right = a.size()-1;

        while (left < right){
            int temp = a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);
            left++;
            right--;
        }
        return a;
    }

}

