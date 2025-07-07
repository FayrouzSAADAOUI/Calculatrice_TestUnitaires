public class Compteur {
    private int count;

    public Compteur() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void reset() {
        count = 0;
    }
}
