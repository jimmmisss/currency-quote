package br.com.money.adapter.out.api.awesomeapi;

import br.com.money.adapter.payload.JsonCurrencyQuoteValue;
import br.com.money.application.port.out.GetCurrencyQuotePortOut;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Map;

@ApplicationScoped
@RequiredArgsConstructor
public class AwesomeApiService implements GetCurrencyQuotePortOut {

    @Inject
    @RestClient
    AwesomeApi awesomeApi;

    private final CurrencyQuoteMapper currencyQuoteMapper;

    @Override
    public Map<String, JsonCurrencyQuoteValue> getCurrenciesQuoteApi(String currencies) {
        return awesomeApi.currencyQuoteValues(currencies);
    }
}
