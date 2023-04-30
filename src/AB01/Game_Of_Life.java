package AB01;

public class Game_Of_Life {
    // global definierte Konstanten für die beiden Dimensionen
    final static int DIM1 = 12;
    final static int DIM2 = 12;
    // liefert eine zufällig initialisierte Welt

    /**
     * creates a boolean matrix and sets its size then gives each cell either true (60%) or false (40%)
     *
     * @return
     */
    public static boolean[][] initWelt() {
        boolean[][] welt = new boolean[DIM1 - 2][DIM2 - 2];
        for (int zeile = 0; zeile < welt.length; zeile++) {
            for (int spalte = 0; spalte < welt.length; spalte++) {
                welt[zeile][spalte] = Math.random() > 0.4;
                //System.out.println(welt[zeile][spalte]);
            }
        }
        return welt;
    }

    /**
     * gibt die aktuelle Welt aus
     */
    public static void zeigeWelt(boolean[][] welt) {
        for (int zeile = 0; zeile < welt.length; zeile++) {
            for (int spalte = 0; spalte < welt[zeile].length; spalte++) {
                if (welt[zeile][spalte] == true) {
                    System.out.print(" \uD83D\uDE04 ");
                } else {
                    System.out.print(" \uD83D\uDC80 ");
                }
            }
            System.out.println();
        }
    }

    /**
     * wendet die 4 Regeln an und gibt die Folgegeneration wieder zurück
     */
    public static boolean[][] wendeRegelnAn(boolean[][] welt) {
        boolean[][] neueWelt = new boolean[DIM1][DIM2];
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int nachbarn = anzNachbarn(welt, i, j);
                if (welt[i][j]) { // lebendig
                    if (nachbarn < 2) {
                        neueWelt[i][j] = false;
                    } else if (nachbarn > 3) {
                        neueWelt[i][j] = false;
                    } else {
                        neueWelt[i][j] = true;
                    }
                } else { //tot
                    if (nachbarn == 3) {
                        welt[i][j] = true;
                    }
                }
            }
        }
        return welt;
    }

    public static int anzNachbarn(boolean[][] welt, int x, int y) {
        int ret = 0;
        for (int i = x - 1; i <= x + 1; ++i) {
            for (int j = y - 1; j <= y + 1; ++j) {
                if (welt[i][j]) ret += 1;
            }
        }
        // einen Nachbarn zuviel mitgezählt?
        if (welt[x][y]) ret -= 1;
        return ret;
    }

}


