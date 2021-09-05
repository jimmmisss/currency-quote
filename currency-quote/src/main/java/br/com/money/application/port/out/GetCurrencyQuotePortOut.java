package br.com.money.application.port.out;

import br.com.money.adapter.payload.JsonCurrencyQuoteValue;

import java.util.Map;

public interface GetCurrencyQuotePortOut {

    Map<String, JsonCurrencyQuoteValue> getCurrenciesQuoteApi(String currencies);
}
