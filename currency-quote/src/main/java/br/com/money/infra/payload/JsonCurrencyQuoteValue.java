package br.com.money.infra.payload;

public class JsonCurrencyQuoteValue {

    private String name;
    private String high;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }
}