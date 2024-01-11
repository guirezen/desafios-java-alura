package lidandoComExecoes03.senha;

import lidandoComExecoes03.senha.excecoes.SenhaInvalidaException;
import lidandoComExecoes03.senha.modelos.Senha;

import java.util.Scanner;

public class PrincipalSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite sua lidandoComExecoes03.senha: ");
            Senha senha = new Senha(entrada.next());
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
