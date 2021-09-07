package br.com.money.application.port.in;

import br.com.money.application.domain.CurrencyQuoteValue;

import java.util.List;

public interface GetCurrencyQuotePortIn {

    List<CurrencyQuoteValue> getCurrencyQuotes(String currencyName);
}
