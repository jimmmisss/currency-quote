package br.com.money.infra.payload;

public class JsonCurrencyQuote {

    private JsonCurrencyQuoteValue value;

    public JsonCurrencyQuoteValue getValue() {
        return value;
    }

    public void setValue(JsonCurrencyQuoteValue value) {
        this.value = value;
    }
}