package br.com.money.adapter.payload;

public class JsonCurrencyQuote {

    private JsonCurrencyQuoteValue jsonCurrencyQuoteValue;

    public JsonCurrencyQuote(JsonCurrencyQuoteValue jsonCurrencyQuoteValue) {
        this.jsonCurrencyQuoteValue = jsonCurrencyQuoteValue;
    }

    public JsonCurrencyQuoteValue getJsonCurrencyQuoteValue() {
        return jsonCurrencyQuoteValue;
    }

    public void setJsonCurrencyQuoteValue(JsonCurrencyQuoteValue jsonCurrencyQuoteValue) {
        this.jsonCurrencyQuoteValue = jsonCurrencyQuoteValue;
    }
}
