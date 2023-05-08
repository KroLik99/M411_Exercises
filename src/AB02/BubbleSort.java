package AB02;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] original){
        int[] array = Arrays.copyOf(original, original.length);

        int x;
        for (int j = 0; j <array.length-1 ; j++) {

            for(int i = 0; i < array.length-1; i++){
                if(array[i]>array[i+1]){
                    x = array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                }
            }

        }

        return array;
    }
}
