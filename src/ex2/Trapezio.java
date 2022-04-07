package ex2;

public class Trapezio implements calculosGerais{
    public Trapezio() {
        super();
    }

    @Override
    public int calculodeArea(int a, int b, int c) {
        return (a+b)*c/2;
    }
}
