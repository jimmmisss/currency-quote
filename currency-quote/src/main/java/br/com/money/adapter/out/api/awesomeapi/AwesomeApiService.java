package br.com.money.adapter.out.api.awesomeapi;

import br.com.money.infra.payload.JsonCurrencyQuoteValue;
import br.com.money.application.port.out.GetCurrencyQuotePortOut;
import br.com.money.infra.payload.JsonCurrencyQuoteValueApi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Map;

@ApplicationScoped
public class AwesomeApiService implements GetCurrencyQuotePortOut {

    @Inject
    @RestClient
    AwesomeApi awesomeApi;

    @Override
    public Map<String, JsonCurrencyQuoteValueApi> getCurrenciesQuoteApi(String currencies) {
        return awesomeApi.currencyQuoteValues(currencies);
    }
}
