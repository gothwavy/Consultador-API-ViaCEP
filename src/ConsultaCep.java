import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public static Endereco buscaCep(String cep) {
        // Criando a URI da request
        var endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        // Criando o request com o CEP inserido
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        // Obtendo a response da request
        HttpResponse<String> response;
        try {
            // Criando o client
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.body().contains("erro")) {
                throw new RuntimeException("Cep nao existe!");
            }
        } catch (IOException | InterruptedException e ) {
            System.out.println("\nOps, algo ocorreu! Erro ocorrido:\n" + e);
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Endereco.class);
    }
}
