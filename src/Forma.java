public class Forma {
    public int base;
    public int altezza;

    public Forma(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void calcolaArea() {
        int area = base * altezza;
        System.out.println("L'area della forma è: " + area);
    }
}
