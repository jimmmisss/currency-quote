package br.com.money.application.port.out;

import br.com.money.infra.payload.JsonCurrencyQuoteValueApi;

import java.util.Map;

public interface GetCurrencyQuotePortOut {

    Map<String, JsonCurrencyQuoteValueApi> getCurrenciesQuoteApi(String currencies);
}
