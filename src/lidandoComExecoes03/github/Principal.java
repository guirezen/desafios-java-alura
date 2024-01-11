package lidandoComExecoes03.github;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lidandoComExecoes03.github.excecao.ErroConsultaGitHubException;
import lidandoComExecoes03.github.modelo.Usuario;
import lidandoComExecoes03.github.modelo.UsuarioGit;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o usuário desejado: ");
        var usuario = entrada.next();
        var endereco = "https://api.github.com/users/" + usuario;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            var json = response.body();
            System.out.println("retorno cru: " + json);

            Gson gson = new GsonBuilder().create();
            UsuarioGit usuarioGit = gson.fromJson(json, UsuarioGit.class);


            Usuario usuarioConvertido = new Usuario(usuarioGit);
            System.out.println(usuarioConvertido);
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }

    }
}
