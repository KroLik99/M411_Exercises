import AB02.InsertionSort;
import AB02.Zeitmessung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static AB01.Game_Of_Life.*;


public class Main {
    public static void main(String[] args) {
        int[] liste = new int[10];
        for(int i = 0; i<liste.length; i++){
          liste[i] = (int) (Math.random()*10);
        }
        for(int b : liste){
            System.out.println("b: " + b);
        };
        InsertionSort i = new InsertionSort();
        i.insertionsort(liste);
    }
}