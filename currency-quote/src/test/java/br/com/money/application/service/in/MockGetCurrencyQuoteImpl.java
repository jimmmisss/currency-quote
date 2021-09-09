package br.com.money.application.service.in;

import br.com.money.adapter.out.api.awesomeapi.AwesomeApiService;
import br.com.money.infra.payload.JsonCurrencyQuoteValueApi;
import io.quarkus.test.Mock;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@Mock
@ApplicationScoped
public class MockGetCurrencyQuoteImpl extends AwesomeApiService {

    @Override
    public Map<String, JsonCurrencyQuoteValueApi> getCurrenciesQuoteApi(String currencies) {
        Map<String, JsonCurrencyQuoteValueApi> map = new HashMap<>();
        var jsonApi = new JsonCurrencyQuoteValueApi();
        jsonApi.setCode("USDBRL");
        jsonApi.setHigh("5.734");
        map.put("USDBRL", jsonApi);
        return map;
    }
}
