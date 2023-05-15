package AB02;

import java.util.ArrayList;

public class InsertionSort {

    public void insertionsort(int[] liste) {
        int neuesElement;
        ArrayList<Integer> neueListe = new ArrayList<>();
        neueListe.add(liste[0]);
        for(int i = 1; i < liste.length; i++){
            neuesElement = liste[i];

            if(neuesElement >= neueListe.get(neueListe.size()-1)){
                neueListe.add(neuesElement);
            }else{
                for(int indexList = 0; indexList < neueListe.size();indexList++){
                    if(neuesElement < neueListe.get(indexList)){
                        //wenn das neueElement kleiner ist als das nächst Grösste -> shift davor und restliche um eins nach rechts gerückt.
                        neueListe.add(indexList,neuesElement);
                        break;
                    }
                }
            }



        }
        for(int b : neueListe){
        System.out.println(b);}
    }

//MAIN
/*
int[] liste = new int[10];
        for(int i = 0; i<liste.length; i++){
        liste[i] = (int) (Math.random()*10);
    }
        for(int b : liste){
        System.out.println("b: " + b);
    };
    InsertionSort i = new InsertionSort();
        i.insertionsort(liste);















        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        BubbleSort b = new BubbleSort();

        Zeitmessung zeitmesser = new Zeitmessung();
        int[] newArray = b.bubbleSort(arr);
        System.out.println("Zeitmesser1: " + zeitmesser.elapsedTime());

        InsertionSort i = new InsertionSort();
        Zeitmessung zeitmesser1 = new Zeitmessung();
        i.insertionsort(arr);
        System.out.println("Zeitmesser2: "+zeitmesser1.elapsedTime());

        Zeitmessung zeitmesser2 = new Zeitmessung();
        Arrays.sort(arr);
        System.out.println("Zeitmesser3: "+zeitmesser2.elapsedTime());
} */
}
