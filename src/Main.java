import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Instaciamento de objetos
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite 'sair' para encerrar o programa ou digite o cep para continuar:");
            var resposta = scanner.nextLine();
            if (resposta.equals("sair")) {
                System.out.println("\nEncerrando o programa...");
                break;
            } else if (!resposta.matches("\\d{8}")) {
                System.out.println("\nDigite um cep valido para continuar!");
                continue;
            }

            // Instanciando o objeto necessario para consultar e puxar as informacoes da api
            Endereco endereco = ConsultaCep.buscaCep(resposta);

            // Instanciando o objeto que ficara responsavel por gerar o arquivo json
            Gerador.NovoJson(endereco);
        }
    }
}