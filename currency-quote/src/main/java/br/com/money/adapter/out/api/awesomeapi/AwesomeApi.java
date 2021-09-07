package br.com.money.adapter.out.api.awesomeapi;

import br.com.money.infra.payload.JsonCurrencyQuoteValue;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import java.util.Map;

@Path("/json/last")
@RegisterRestClient(configKey = "currency-quote-api")
@RegisterProvider(NotFoundException.class)
public interface AwesomeApi {

    @GET
    @Path("/{currencies}")
    @Produces("application/json")
    Map<String, JsonCurrencyQuoteValue> currencyQuoteValues(@PathParam("currencies") String currencies);
}
