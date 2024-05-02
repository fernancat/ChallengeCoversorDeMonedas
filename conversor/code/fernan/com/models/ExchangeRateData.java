package fernan.com.models;

import com.google.gson.Gson;

public class ExchangeRateData {
    public String conversion;

    public static APIClientDTO exchangeRateDataDeserealization(String json) {
        Gson gson = new Gson();
        APIClientDTO conversion = gson.fromJson(json, APIClientDTO.class);
        return conversion;

    }



}
