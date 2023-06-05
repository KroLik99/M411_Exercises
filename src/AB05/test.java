package AB05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class test {

    public static int findSmallestElementArrayList(List<Integer> list) {
        int smallest = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int findSmallestElementLinkedList(List<Integer> list) {
        int smallest = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int findSmallestElementLinkedListIterator(List<Integer> list) {
        int smallest = Integer.MAX_VALUE;
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            int current = it.next();
            if (current < smallest) {
                smallest = current;
            }
         }
         return smallest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Füllen der Listen mit Zufallszahlen
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = (int) (Math.random() * 1000000+17);
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

        startTime = System.currentTimeMillis();
        int smallestLinkedList_Iterator = findSmallestElementLinkedListIterator(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Kleinste Zahl in LinkedList  (Iterator): " + smallestLinkedList_Iterator);
        System.out.println("Verstrichene Zeit für LinkedList (Iterator): " + (endTime - startTime) + " Millisekunden");
    }
}

