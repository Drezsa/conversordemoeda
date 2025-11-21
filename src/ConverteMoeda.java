import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConverteMoeda {
    public Moedas buscaMoedas() {
        String chave = Config.getApiKey();
        String endereco = "https://v6.exchangerate-api.com/v6/" + chave + "/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(requisicao, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            JsonObject rates = json.getAsJsonObject("conversion_rates");

            double usd = rates.get("USD").getAsDouble();
            double brl = rates.get("BRL").getAsDouble();
            double ars = rates.get("ARS").getAsDouble();
            double cop = rates.get("COP").getAsDouble();

            return new Moedas(usd, brl, ars, cop);

        }catch (Exception e) {
            throw new RuntimeException("Erro ao consultar a API de Moedas");
        }

    }

    public double converte(double valor, double taxaOrigem, double taxaDestino){
        return (valor * taxaOrigem) / taxaDestino;
    }
}
