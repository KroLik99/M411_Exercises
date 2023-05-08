import AB02.InsertionSort;
import AB02.WarmUp;
import AB02.Zeitmessung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static AB01.Game_Of_Life.*;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{
                1,2,6,4,2
        };
        WarmUp w = new WarmUp();
        System.out.println(w.checkOdd(array));
    }
}