package br.com.money.application.service.in;

import br.com.money.adapter.payload.JsonCurrencyQuote;
import br.com.money.application.domain.CurrencyQuote;
import br.com.money.application.port.in.GetCurrencyQuoteIn;
import br.com.money.application.port.out.GetCurrencyQuoteOut;
import br.com.money.infra.InjectContext;

import java.util.List;

@InjectContext
public class GetCurrencyQuoteImpl implements GetCurrencyQuoteIn {

    private final GetCurrencyQuoteOut getCurrencyQuoteOut;

    public GetCurrencyQuoteImpl(GetCurrencyQuoteOut getCurrencyQuoteOut) {
        this.getCurrencyQuoteOut = getCurrencyQuoteOut;
    }

    @Override
    public List<CurrencyQuote> getCurrencyQuote(String currencies, String currencyValue) {
        return getCurrencyQuoteOut.getCurrenciesQuoteApi(currencies);
    }
}
