package AB05;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Füllen der Listen mit Zufallszahlen
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = (int) (Math.random() * 1000000);
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }
        long startTime = System.currentTimeMillis();
        int smallestArrayList = findSmallestElementArrayList(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("Kleinste Zahl in ArrayList: " + smallestArrayList);
        System.out.println("Verstrichene Zeit für ArrayList: " + (endTime - startTime) + " Millisekunden");
        startTime = System.currentTimeMillis();
        int smallestLinkedList = findSmallestElementLinkedList(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Kleinste Zahl in LinkedList: " + smallestLinkedList);
        System.out.println("Verstrichene Zeit für LinkedList: " + (endTime - startTime) + " Millisekunden");


    }

    private static int findSmallestElementLinkedList(LinkedList<Integer> linkedList) {
        /*int smallest = linkedList.get(0);
        for (int element:linkedList) {
            if(element < smallest){
                smallest = element;
            }
        }
        return smallest;*/
        int smallest = Integer.MAX_VALUE;
        for (int num : linkedList) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    private static int findSmallestElementArrayList(ArrayList<Integer> arrayList) {
        /*int smallest = arrayList.get(0);
        for (int element:arrayList) {
            if(element < smallest){
                smallest = element;
            }
        }
        return smallest;*/
        int smallest = Integer.MAX_VALUE;
        for (int num : arrayList) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}
