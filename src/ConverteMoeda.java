import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;


public class ConverteMoeda {
    public Moedas buscaMoedas(int opcao) {
        String chave = "5ae0f8196aa8f48edb17150b";
        String endereco = ("https://v6.exchangerate-api.com/v6/" + chave + "/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest  requisicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();


    }
}
