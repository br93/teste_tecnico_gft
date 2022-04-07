package ex2;

public class Triangulo implements calculosGerais {
    public Triangulo() {
        super();
    }

    @Override
    public int calculodeArea(int a, int b, int c) {
        return a*b/2;
    }


}
