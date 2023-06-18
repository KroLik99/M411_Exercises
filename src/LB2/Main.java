package LB2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final String[] cities = {"Genf", "Bern", "Chur", "Lugano", "Zürich"};
        Aufgaben a = new Aufgaben();
        System.out.println("LB2-M411");

        // Aufgabe 1  - vertauschen
        System.out.println("\n*** Aufgabe 1 - swap ***");
        System.out.println(java.util.Arrays.toString(cities)); //Genf, Bern, Chur, Lugano. Zürich
        a.swap(cities, 1,3);
        System.out.println(java.util.Arrays.toString(cities)); //Genf, Lugano, Chur, Bern. Zürich
        a.swap(cities, 2,13);
        a.swap(cities, -3,-5);
        a.swap(cities, 15,20);
        System.out.println(java.util.Arrays.toString(cities));


        // Aufgabe 2  - Datei einlesen und Daten sortiert ausgeben
        System.out.println("\n*** Aufgabe 2 - readFile ***");
        String filename = "/home/vmadmin/Dokumente/411/M411_Exercises/src/LB2/name.txt";
        a.readFile(filename);


        // Aufgabe 3  - Programm-Argument verarbeiten
        System.out.println("\n*** Aufgabe 3 - Programm-Argument ***");
        // Implementieren Sie hier die Aufgabe 3
        // Der Variablen 'filename' soll das erste Programm-Argument
        // zugewiesen werden, ausser der Wert ist null.
        // Setzen Sie in der IDE als Programm-Argument den Wert 'namen_w.txt' oder 'namen_m.txt'.
        // Die beiden Dateien befinden sich auf dem Schreibtisch (Desktop).
        // Die Methode readFile(filename) soll mit dem neuen Wert erneut aufgerufen werden.
        for(int i = 0; i < args.length; i++ ){
            args[0] = filename;
            a.readFile(args[0]);
            System.out.println("Done Aufgabe 3");
        }

        // Aufgabe 4  - Memory-Wörter ausgeben
        System.out.println("\n*** Aufgabe 4 - displayMemoryWords ***");
        String[] words = {"Apfel", "Birne", "Orange", "Zitrone", "Kiwi", "Banane"};
        a.displayMemoryWords(words);
        a.displayMemoryWords(words);


        // Aufgabe 5 - Klammerung prüfen
        System.out.println("\n*** Aufgabe 5 - bracketCheck ***");
        String e1 = "2*(3+4)-1/((3*4)+17)";  // OK
        String e2 = "3*((7-1)";              // nicht ok
        String e3 = "3*)(7-1";               // nicht ok
        String e4 = ")(3*7)-1(";             // nicht ok
        String e5 = "3*7-1";                 // OK

        System.out.println(e1 + ": " + a.bracketCheck(e1));
        System.out.println(e2 + ": " + a.bracketCheck(e2));
        System.out.println(e3 + ": " + a.bracketCheck(e3));
        System.out.println(e4 + ": " + a.bracketCheck(e4));
        System.out.println(e5 + ": " + a.bracketCheck(e5));

        // Aufgabe 6 - Potenzieren mit Rekursion
        System.out.println("\n*** Aufgabe 6 - potenz ***");
        System.out.println("2⁵=" + a.potenz(2,5));      // 32
        System.out.println("2⁴=" + a.potenz(2,4));      // 16
        System.out.println("3⁴=" + a.potenz(3,4));      // 16
        System.out.println("2⁰=" + a.potenz(2,0));      // 1
        System.out.println("2⁽⁻²⁾=" + a.potenz(2,-2));  // 0.25    = 1/4
        System.out.println("2⁽⁻⁵⁾=" + a.potenz(2,-5));  // 0.03125 = 1/32

    }

}
