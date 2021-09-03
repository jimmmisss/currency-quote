package br.com.money.adapter.out.api.awesomeapi;

import br.com.money.application.domain.CurrencyQuote;
import br.com.money.application.port.out.GetCurrencyQuoteOut;
import br.com.money.infra.InjectContext;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
import java.util.stream.Collectors;

@InjectContext
public class AwesomeApiService implements GetCurrencyQuoteOut {

    @RestClient
    AwesomeApi awesomeApi;

    private final CurrencyQuoteMapper currencyQuoteMapper;

    public AwesomeApiService(CurrencyQuoteMapper currencyQuoteMapper) {
        this.currencyQuoteMapper = currencyQuoteMapper;
    }

    @Override
    public List<CurrencyQuote> getCurrenciesQuoteApi(String currencies) {
        var jsonCurrencyQuotes = awesomeApi.currencyQuoteValues(currencies);
        return jsonCurrencyQuotes.stream()
                .map(currencyQuoteMapper::map)
                .collect(Collectors.toList());
    }
}