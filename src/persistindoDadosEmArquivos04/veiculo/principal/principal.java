package persistindoDadosEmArquivos04.veiculo.principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import persistindoDadosEmArquivos04.veiculo.modelo.Veiculo;

public class principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Terrestre", 5, "Flex");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        var veiculoJson = gson.toJson(veiculo);

        System.out.println("veiculo em json " + veiculoJson);
    }
}
