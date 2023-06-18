package LB2;
import java.io.*;
import java.text.Collator;
import java.util.*;

public class Aufgaben {

        // Vorlage LB2_NameVorname.java
// Bitte Datei und Klassennamen anpassen.
//
// Kompilieren:    javac LB2_NameVorname.java
// Ausführen:      java LB2_NameVorname
//

        public static void swap(String[] array, int i, int j) {
            // Implementieren Sie hier die Aufgabe 1
            if(!(i>array.length || j>array.length || i<0 || j<0)){
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            };
        }

        public static void readFile(String filename) throws IOException {
            // Implementieren Sie hier die Aufgabe 2
           /* String[] zeilen = new String[100];
            try(Scanner scanner = new Scanner(new File(filename), "UTF-8")){
                int zeilenZaehler = 0;
                while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    zeilen[zeilenZaehler] = line;
                    System.out.println("");
                    zeilenZaehler++;
                }
                System.out.println("Unsortiert " +zeilen.toString());
                Arrays.sort(zeilen);
                scanner.close();
                System.out.println(zeilen);
            }catch (FileNotFoundException e){
                System.out.println("File was not found!");
                //e.printStackTrace();
            };*/
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<String>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();

            Collections.sort(lines, Collator.getInstance());

            FileWriter writer = new FileWriter(filename);
            for(String str: lines) {
                writer.write(str + "\r\n");
            }
            writer.close();

        }

        public static void displayMemoryWords(String[] words) {
            // Implementieren Sie hier die Aufgabe 4
            List newWords = Arrays.asList(words);
            Collections.shuffle(newWords);
            for(int i = 0; i<4; i++){
            System.out.print(newWords.get(i) + " ");
            }
            System.out.println();
        }

        public static boolean bracketCheck(String expr){
            // Implementieren Sie hier die Aufgabe 5
            Deque<Character> stack = new ArrayDeque<Character>();

            // Traversing the Expression
            for (int i = 0; i < expr.length(); i++)
            {
                char x = expr.charAt(i);

                if (x == '(' || x == '[' || x == '{')
                {
                    // Push the element in the stack
                    stack.push(x);
                    continue;
                }

                // If current character is not opening
                // bracket, then it must be closing. So stack
                // cannot be empty at this point.
                if (stack.isEmpty())
                    return true;
                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }

            // Check Empty Stack
            return (stack.isEmpty());
        }


        public static float potenz(int basis, int exponent) {
            // Implementieren Sie hier die Aufgabe 6
            if (exponent == 0) {
                return 1;
            }
            else {
                int newExponent = --exponent;
                return exponent*potenz(basis, newExponent);
            }
        }

    }

