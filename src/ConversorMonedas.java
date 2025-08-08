import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorMonedas {
    Scanner teclado = new Scanner(System.in);

    public void convertirMoneda(String monedaEntrada, String monedaDestino) throws IOException, InterruptedException {
        System.out.println("Digite la cantidad de la moneda a convertir:");
        double cantidad = teclado.nextDouble();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/2afc7d028ba3a1dec99d514e/pair/" + monedaEntrada + "/" + monedaDestino))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonRespuesta = response.body();
        System.out.println(jsonRespuesta);

        // Parse the JSON string into a JsonElement
        JsonElement je = JsonParser.parseString(jsonRespuesta);
        // Convert to JsonObject if the root is an object (Jason Object)
        JsonObject jo = je.getAsJsonObject();
        // Get a specific value of the JsonObject
        double resultado = jo.get("conversion_rate").getAsDouble();

        System.out.println(cantidad + " " + monedaEntrada + " es equivalente a: " + (resultado*cantidad) + " " + monedaDestino);
    }

    public int convertirMoneda2(String monedaEntrada, String monedaDestino, int cantidaAConvertir){
        //int resultado = 0;
        return 2;
    }
}