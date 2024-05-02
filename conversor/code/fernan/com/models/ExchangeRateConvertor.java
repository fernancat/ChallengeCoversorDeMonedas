package fernan.com.models;

public class ExchangeRateConvertor {
    private final APIClientExchange apiclient;

    public ExchangeRateConvertor() {
        this.apiclient = new APIClientExchange();
    }

    public String convertirDivisas(String monedaOrigen, String monedaDestino, Double monto) {
        String json = apiclient.solicitud("https://v6.exchangerate-api.com/v6/APIKEY/pair/" + monedaOrigen + "/" + monedaDestino + "/" + monto);
        APIClientDTO apiClientDTO = ExchangeRateData.exchangeRateDataDeserealization(json);
        return apiClientDTO.conversion_result();
    }

    public String calcularDolarAPesosArgentinos(Double monto) {
        return convertirDivisas("USD", "ARS", monto);
    }

    public String pesoArgentinoADolar(Double monto) {
        return convertirDivisas("ARS", "USD", monto);
    }

    public String calcularDolarARealBrasileno(Double monto) {
        return convertirDivisas("USD", "BRL", monto);
    }

    public String calcularRealBrasilenoADolar(Double monto) {
        return convertirDivisas("BRL", "USD", monto);
    }

    public String calcularDolarAPesoColombiano(Double monto) {
        return convertirDivisas("USD", "COP", monto);
    }

    public String calcularPesoColombianoADolar(Double monto) {
        return convertirDivisas("COP", "USD", monto);
    }
}
