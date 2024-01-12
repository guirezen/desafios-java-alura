package persistindoDadosEmArquivos04.veiculo.modelo;

public class Veiculo {
    private String tipo;
    private int capacidadeDePessoas;
    private String combustivel;


    public Veiculo(String tipo, int capacidadeDePessoas, String combustivel) {
        this.tipo = tipo;
        this.capacidadeDePessoas = capacidadeDePessoas;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo: " + this.tipo + this.combustivel + this.capacidadeDePessoas;
    }
}
