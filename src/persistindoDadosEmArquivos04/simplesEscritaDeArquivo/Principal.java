package persistindoDadosEmArquivos04.simplesEscritaDeArquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        FileWriter escrita = new FileWriter("teste01.txt");

        //System.out.println("Digite o que quer salvar no arquivo: ");
        escrita.append("Conteúdo a ser gravado no arquivo.");
        //escrita.write(entrada.next());
        escrita.close();
    }
}
