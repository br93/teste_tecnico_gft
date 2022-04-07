package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        List<Integer> primos = new ArrayList<>();

        while (numero<=3 || numero >=999)
        {
            numero = scanner.nextInt();
            for (int i=3; i<=numero; i++)
            {
                int x = divisao(i, numero);
                if (x == 1)
                    primos.add(i);
            }

        }
        System.out.println(primos);
    }

    public static int divisao (int a, int b){
        if (b == 0)
            return a;
        else
            return divisao (a, a%b);
    }
}
