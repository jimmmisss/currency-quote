package br.com.money.application.port.in;

import br.com.money.application.domain.CurrencyQuote;

import java.util.List;

public interface GetCurrencyQuotePortIn {

    List<CurrencyQuote> getCurrencyQuotes(String currencyName, String currencyValue);
}
