import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ConsultarMoneda {
    public ConsultarMoneda() {
    }

    public Monedas buscarMonedas(String monedaBase, String monedaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c2ddbb77a055e894d793c1e4/pair/" + monedaBase + "/" + monedaTarget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return (Monedas)(new Gson()).fromJson((String)response.body(), Monedas.class);
        } catch (Exception var7) {
            throw new RuntimeException("No encontre la moneda");
        }
    }
}

