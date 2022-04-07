package ex1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        LocalDate diaAtual = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano;

        System.out.println("Informe o dia (DD) de nascimento da pessoa 1");
        dia = scanner.nextInt();
        System.out.println("Informe o mes (MM) de nascimento da pessoa 1");
        mes = scanner.nextInt();
        System.out.println("Informe o ano (AAAA) de nascimento da pessoa 1");
        ano = scanner.nextInt();
        LocalDate dataDeNascimento1 = LocalDate.of(ano, mes, dia);
        long idadePessoa1 = ChronoUnit.DAYS.between(dataDeNascimento1, diaAtual);

        System.out.println("Informe o dia (DD) de nascimento da pessoa 2");
        dia = scanner.nextInt();
        System.out.println("Informe o mes (MM) de nascimento da pessoa 2");
        mes = scanner.nextInt();
        System.out.println("Informe o ano (AAAA) de nascimento da pessoa 2");
        ano = scanner.nextInt();
        LocalDate dataDeNascimento2 = LocalDate.of(ano, mes, dia);
        long idadePessoa2 = ChronoUnit.DAYS.between(dataDeNascimento2, diaAtual);

        System.out.println("A pessoa mais velha tem " + Math.abs(idadePessoa1-idadePessoa2) + " dia a mais vivido que a pessoa mais nova" );


    }
}
