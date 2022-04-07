package ex3;

import java.util.HashMap;
import java.util.Map;

public class Exercicio3 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("raca", "Pequeno", 15);
        Pessoa pessoa = new Pessoa("Ze", 25, cachorro);

        int idadePet = cachorro.getIdade();
        int idadeHumanaPet = 0;
        int idadePessoa = pessoa.getIdadePessoa();
        int diferencaIdade;

        Map<Integer, Integer> idadesPetPequeno = new HashMap<>() {{
            put(1, 15);
            put(2, 24);
            put(3, 28);
            put(4, 32);
            put(5, 36);
            put(6, 40);
            put(7, 44);
            put(8, 48);
            put(9, 52);
            put(10, 56);
            put(11, 60);
            put(12, 64);
            put(13, 68);
            put(14, 65);
            put(15, 76);
        }};

        Map<Integer, Integer> idadesPetMedio = new HashMap<>() {{
            put(1, 15);
            put(2, 24);
            put(3, 28);
            put(4, 32);
            put(5, 36);
            put(6, 42);
            put(7, 47);
            put(8, 51);
            put(9, 56);
            put(10, 60);
            put(11, 65);
            put(12, 69);
            put(13, 74);
            put(14, 78);
            put(15, 83);
        }};

        Map<Integer, Integer> idadesPetGrande = new HashMap<>() {{
            put(1, 15);
            put(2, 24);
            put(3, 28);
            put(4, 32);
            put(5, 36);
            put(6, 45);
            put(7, 50);
            put(8, 55);
            put(9, 61);
            put(10, 66);
            put(11, 72);
            put(12, 77);
            put(13, 82);
            put(14, 88);
            put(15, 93);
        }};

        if (pessoa.getPet().getPorte().equals("Pequeno")) {
            if (idadesPetPequeno.containsKey(idadePet))
                idadeHumanaPet = idadesPetPequeno.get(idadePet);
        }

        if (pessoa.getPet().getPorte().equals("Medio")) {
            if (idadesPetMedio.containsKey(idadePet))
                idadeHumanaPet = idadesPetMedio.get(idadePet);
        }

        if (pessoa.getPet().getPorte().equals("Grande")) {
            if (idadesPetGrande.containsKey(idadePet))
                idadeHumanaPet = idadesPetGrande.get(idadePet);
        }

        diferencaIdade = Math.abs(idadePessoa - idadeHumanaPet);
        System.out.println(diferencaIdade);


    }
}
