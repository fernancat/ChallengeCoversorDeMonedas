package fernan.com.models;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIClientExchange {

    public String solicitud(String Link){

        try{
            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create(Link))
                    .build();

            HttpResponse<String> response = cliente
                    .send(solicitud, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json.toString());
            return json;
        }catch(IOException e){
            System.out.println(e);
            return null;
        }catch(InterruptedException e){
            System.out.println(e);
            return null;
        }
    }











}
