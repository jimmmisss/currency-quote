package br.com.money.application.service.in;

import br.com.money.application.domain.CurrencyQuoteValue;
import br.com.money.application.port.in.GetCurrencyQuotePortIn;
import br.com.money.application.port.out.GetCurrencyQuotePortOut;
import br.com.money.infra.InjectContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@InjectContext
public class GetCurrencyQuoteImpl implements GetCurrencyQuotePortIn {

    private final GetCurrencyQuotePortOut getCurrencyQuotePortOut;

    public GetCurrencyQuoteImpl(GetCurrencyQuotePortOut getCurrencyQuotePortOut) {
        this.getCurrencyQuotePortOut = getCurrencyQuotePortOut;
    }

    @Override
    public List<CurrencyQuoteValue> getCurrencyQuotes(String currencies, BigDecimal valueProduct) {

        var currenciesQuoteApi = getCurrencyQuotePortOut.getCurrenciesQuoteApi(currencies);
        List<CurrencyQuoteValue> map = new ArrayList<>();

        currenciesQuoteApi.values().stream()
                .map(jsonCurrencyQuoteValue -> {
                    var valueCurrencyApi = BigDecimal.valueOf(Double.parseDouble(jsonCurrencyQuoteValue.getHigh()));
                    var valueProductCurrency = valueCurrencyApi.multiply(valueProduct);
                    CurrencyQuoteValue currencyQuoteValue = new CurrencyQuoteValue();
                    currencyQuoteValue.setCode(jsonCurrencyQuoteValue.getCode());
                    currencyQuoteValue.setValueProductInCurrency(valueProductCurrency);
                    return map.add(currencyQuoteValue);
                }).collect(Collectors.toList());

        return map;
    }
}
