package ex2;

public class ex2 {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Trapezio trapezio = new Trapezio();
        Triangulo triangulo = new Triangulo();

        int areaDoQuadrado = quadrado.calculodeArea(2, 0, 0 );
        int areaDoRetangulo = retangulo.calculodeArea(2,2,0);
        int areaDoTrapezio = trapezio.calculodeArea(2,2,4);
        int areaDoTriangulo = triangulo.calculodeArea(2, 2, 0);

        System.out.println("ÁREA DO QUADRADO = " + areaDoQuadrado);
        System.out.println("ÁREA DO RETANGULO = " + areaDoRetangulo);
        System.out.println("ÁREA DO TRAPEZIO = " + areaDoTrapezio);
        System.out.println("ÁREA DO TRIANGULO = " + areaDoTriangulo);

    }


}
