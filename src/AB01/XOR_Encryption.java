package AB01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class XOR_Encryption {
    public static String encrypt(String text, int key) {
        // wir werden die Zeichen einzeln codieren
        char[] zeichen = text.toCharArray();
        // bitweise XOR-Verschlüsselung
        for (int i = 0; i < zeichen.length; i++)
            // Mit (char)int wandle int in einen char um
            zeichen[i] = (char) (zeichen[i] ^ key);
        // wir erzeugen aus dem Array vom Typ char einen String
        return new String(zeichen);
    }

    public static void main(String[] args) throws IOException {
        //Parameterübergabe bei Programmaufruf in der Kommandozeile
        System.out.println("");

        int key = Integer.parseInt(args[0]);

        // Dateiverzeichnispfad zur auszulesenden Datei.
        String inputPath = args[1];
        // Dateiverzeichnispfad zur Erstellung der neuen verschlüsselten Datei.
        String outputPath = args[2];
        // Versuche Datei zum Auslesen zu öffnen
        try (Scanner scanner = new Scanner(new File(inputPath), StandardCharsets.UTF_8)) {
            // Writer für Verschlüsselte Zeile zu Speichern
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(outputPath, false));

            // Solange es noch Zeilen gibt, lies diese aus.
            int counter = 0;
            while (scanner.hasNextLine()) {
                //scan the next line of gedicht
                String line = scanner.nextLine();
                //output the nextLine
                System.out.println("Zeile " + counter + ": " + line);
                counter++;
                //take a line from the gedicht.txt and give the key
                String encrypted = encrypt(line, key);
                System.out.println(encrypted);
                //write to encryption
                myWriter.write(encrypted + "\n");
            }
            // schliesse die zu lesende Datei
            scanner.close();
            // schliesse die zu verschlüsselnde Datei
            myWriter.close();
        } catch (IOException eIO) {
            System.out.println("Folgender Fehler trat auf: " + eIO);
        }
    }
}


