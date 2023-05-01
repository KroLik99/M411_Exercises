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


}
