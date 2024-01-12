package persistindoDadosEmArquivos04.buscaDeCep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import persistindoDadosEmArquivos04.buscaDeCep.modelo.Endereco;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite o CEP desejado: ");
            var endereco = "https://viacep.com.br/ws/" + entrada.next() + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            var retornoCru = response.body();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Endereco meuEndereco = gson.fromJson(retornoCru, Endereco.class);

            FileWriter escrever = new FileWriter("endereço.json");
            escrever.write(gson.toJson(meuEndereco));
            escrever.close();

            System.out.println("retorno: " + meuEndereco);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
