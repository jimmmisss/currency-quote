package br.com.money.application.port.in;

import br.com.money.application.domain.CurrencyQuote;

import java.util.List;

public interface GetCurrencyQuoteIn {

    List<CurrencyQuote> getCurrencyQuote(String currencyName, String currencyValue);
}
