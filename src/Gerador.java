import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Gerador {
    public static int numero = 0;

    public static void NovoJson(Endereco endereco) throws IOException {
        // Instanciando o GsonBuilder para formatar corretamente o json de cada cep
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        // Criando um arquivo json para o cep atual
        FileWriter writer = new FileWriter("local" + (++numero) + ".json");
        writer.write(gson.toJson(endereco));
        writer.close();

        System.out.println("\nCep digitado: " + endereco.cep());
        System.out.println("\nResultado:\n" + gson.toJson(endereco));
        System.out.println("\nArquivo 'local" + numero + ".json' gerado com sucesso!");
    }

}
