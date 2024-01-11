package lidandoComExecoes03.divisao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        var dividendo = entrada.nextInt();
        System.out.println("Agora o divisor: ");
        var divisor = entrada.nextInt();

        try {
            System.out.println("Resultado da operação: ");
            var resultado = dividendo/divisor;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por 0.");
        }

    }
}