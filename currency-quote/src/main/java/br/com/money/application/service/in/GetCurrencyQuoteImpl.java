package br.com.money.application.service.in;

import br.com.money.application.domain.CurrencyQuoteValue;
import br.com.money.infra.payload.JsonCurrencyQuoteValue;
import br.com.money.application.port.in.GetCurrencyQuotePortIn;
import br.com.money.application.port.out.GetCurrencyQuotePortOut;
import br.com.money.infra.InjectContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@InjectContext
public class GetCurrencyQuoteImpl implements GetCurrencyQuotePortIn {

    private final GetCurrencyQuotePortOut getCurrencyQuotePortOut;

    public GetCurrencyQuoteImpl(GetCurrencyQuotePortOut getCurrencyQuotePortOut) {
        this.getCurrencyQuotePortOut = getCurrencyQuotePortOut;
    }

    @Override
    public List<CurrencyQuoteValue> getCurrencyQuotes(String currencies) {

        var currenciesQuoteApi = getCurrencyQuotePortOut.getCurrenciesQuoteApi(currencies);
        List<CurrencyQuoteValue> map = new ArrayList<>();
        for (Map.Entry<String, JsonCurrencyQuoteValue> entry : currenciesQuoteApi.entrySet()) {

            CurrencyQuoteValue currencyQuoteValue = new CurrencyQuoteValue();
            currencyQuoteValue.setHigh(entry.getValue().getHigh());
            currencyQuoteValue.setName(entry.getValue().getName());
            map.add(currencyQuoteValue);
        }
        return map;
    }
}
