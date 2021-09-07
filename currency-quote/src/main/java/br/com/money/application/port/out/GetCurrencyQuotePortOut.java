package br.com.money.application.port.out;

import br.com.money.infra.payload.JsonCurrencyQuoteValue;

import java.util.Map;

public interface GetCurrencyQuotePortOut {

    Map<String, JsonCurrencyQuoteValue> getCurrenciesQuoteApi(String currencies);
}
