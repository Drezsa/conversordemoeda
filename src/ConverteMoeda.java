import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConverteMoeda {
    public Moedas buscaMoedas(String origem, String destino) {
        String chave = "5ae0f8196aa8f48edb17150b";
        String endereco = ("https://v6.exchangerate-api.com/v6/" + chave + "/latest/" + origem);

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest  requisicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();

            HttpResponse<String> response = client.send(requisicao, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            JsonObject rates = json.getAsJsonObject("Conversion_rates");

            double taxaDestino = rates.get(destino).getAsDouble();

            return new Moedas(origem, destino, taxaDestino);

        }catch (Exception e) {
            throw new RuntimeException("Erro ao consultar a API: " + e.getMessage());
        }

    }
}
