package ex3;

public class Cachorro {
    private String raca;
    private String porte;
    private int idade;

    public Cachorro(String raca, String porte, int idade) {
        this.raca = raca;
        this.porte = porte;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", porte='" + porte + '\'' +
                ", idade=" + idade +
                '}';
    }
}
