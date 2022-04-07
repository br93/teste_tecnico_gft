package ex3;

public class Pessoa {
    private String nomePessoa;
    private int idadePessoa;
    private Cachorro pet;


    public Pessoa(String nomePessoa, int idadePessoa, Cachorro pet) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.pet = pet;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public Cachorro getPet() {
        return pet;
    }

    public void setPet(Cachorro pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                ", pet=" + pet +
                '}';
    }
}
