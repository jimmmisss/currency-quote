package br.com.money.infra.payload;

public class JsonCurrencyQuoteValueApi {

    private String code;
    private String high;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }
}