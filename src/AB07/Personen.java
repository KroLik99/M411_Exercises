package AB07;

public class Personen implements Comparable<Personen>{
    private int weight;

    public Personen(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Personen personen) {
        if (this.weight == personen.weight) {
            return 0;
        } else if (this.weight < personen.weight) {
            return -1;
        } else {
            return 1;
        }
    }
}
