package persistindoDadosEmArquivos04.buscaDeCep.modelo;

import java.net.http.HttpResponse;

public class Endereco {
    private String cep;
    private String logradouro;
    private int ddd;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco(String logradouro, int ddd, String bairro, String localidade, String uf) {
        this.logradouro = logradouro;
        this.ddd = ddd;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public Endereco(String response) {
        this.logradouro = response;
        this.ddd = ddd;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereço: " + this.logradouro + this.bairro + this.localidade + this.uf + this.ddd;
    }
}
