package br.com.money.application.domain;

import br.com.money.adapter.payload.JsonCurrencyQuoteValue;

public class CurrencyQuote {

    private JsonCurrencyQuoteValue jsonCurrencyQuoteValue;

    public CurrencyQuote() {
    }

    public CurrencyQuote(JsonCurrencyQuoteValue jsonCurrencyQuoteValue) {
        this.jsonCurrencyQuoteValue = jsonCurrencyQuoteValue;
    }

    public JsonCurrencyQuoteValue getJsonCurrencyQuoteValue() {
        return jsonCurrencyQuoteValue;
    }

    public void setJsonCurrencyQuoteValue(JsonCurrencyQuoteValue jsonCurrencyQuoteValue) {
        this.jsonCurrencyQuoteValue = jsonCurrencyQuoteValue;
    }
}

