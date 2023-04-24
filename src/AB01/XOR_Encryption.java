package AB01;

import java.io.*;
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
        // Dateiverzeichnispfad zur auszulesenden Datei.
        String inputPath = "src/AB01/gedicht.txt";
        // Dateiverzeichnispfad zur Erstellung der neuen verschlüsselten Datei.
        String outputPath = "src/AB01/encryption.txt";
        // Versuche Datei zum Auslesen zu öffnen
        try (Scanner scanner = new Scanner(new File(inputPath), "UTF-8") {
            // Writer für Verschlüsselte Zeile zu Speichern
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(inputPath, false));

            // Solange es noch Zeilen gibt, lies diese aus.
            int counter = 0;
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println("Zeile " + counter + ": " + line);
                counter++;
            }
            // schliesse die zu lesende Datei
                    scanner.close();
            // schliesse die zu verschlüsselnde Datei
            ...
        } catch(IOException eIO) {
            System.out.println("Folgender Fehler trat auf: " + eIO);
        }
    }
}


