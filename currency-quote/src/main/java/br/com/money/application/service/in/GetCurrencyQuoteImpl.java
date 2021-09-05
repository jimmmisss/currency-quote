package br.com.money.application.service.in;

import br.com.money.adapter.payload.JsonCurrencyQuote;
import br.com.money.adapter.payload.JsonCurrencyQuoteValue;
import br.com.money.application.domain.CurrencyQuote;
import br.com.money.application.domain.CurrencyQuoteValue;
import br.com.money.application.port.in.GetCurrencyQuotePortIn;
import br.com.money.application.port.out.GetCurrencyQuotePortOut;
import br.com.money.infra.InjectContext;

import java.util.List;
import java.util.Map;

@InjectContext
public class GetCurrencyQuoteImpl implements GetCurrencyQuotePortIn {

    private final GetCurrencyQuotePortOut getCurrencyQuotePortOut;

    public GetCurrencyQuoteImpl(GetCurrencyQuotePortOut getCurrencyQuotePortOut) {
        this.getCurrencyQuotePortOut = getCurrencyQuotePortOut;
    }

    @Override
    public List<CurrencyQuote> getCurrencyQuotes(String currencies, String currencyValue) {
        // apply rules
        var currenciesQuoteApi = getCurrencyQuotePortOut.getCurrenciesQuoteApi(currencies);
        for (Map.Entry<String, JsonCurrencyQuoteValue> x : currenciesQuoteApi.entrySet()) {
            System.out.println(x.getKey() + " = " + x.getValue().getName());
        }
        return null;
    }
}
