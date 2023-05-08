import AB02.InsertionSort;
import AB02.WarmUp;
import AB02.Zeitmessung;
import AB02.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static AB01.Game_Of_Life.*;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        BubbleSort b = new BubbleSort();
        Zeitmessung zeitmesser = new Zeitmessung();

        int[] newArray = b.bubbleSort(arr);
        for (int i : newArray) {
            System.out.println(i);
        }
        System.out.println(zeitmesser.elapsedTime());
    }
}