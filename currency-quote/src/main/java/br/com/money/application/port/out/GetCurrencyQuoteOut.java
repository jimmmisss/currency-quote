package br.com.money.application.port.out;

import br.com.money.application.domain.CurrencyQuote;

import java.util.List;

public interface GetCurrencyQuoteOut {

    List<CurrencyQuote> getCurrenciesQuoteApi(String currencies);
}
