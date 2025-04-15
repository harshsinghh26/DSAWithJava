package com.cyclicSort;

import java.util.Arrays;
import java.util.Collections;

public class Main {
        public static void main(String[] args) {
            int[] arr = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
            Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(boxed, Collections.reverseOrder());
            int[] newArr = Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
            int n = newArr.length;
            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int k = 0; k < j; k++) {
                    if (arr[i] == temp[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    temp[j] = arr[i];
                    j++;
                }
            }

            int[] uniqueArr = Arrays.copyOf(temp, j);
            System.out.println(Arrays.toString(uniqueArr));
        }
}
