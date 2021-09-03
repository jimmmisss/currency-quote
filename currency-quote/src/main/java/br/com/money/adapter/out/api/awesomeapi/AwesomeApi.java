package br.com.money.adapter.out.api.awesomeapi;

import br.com.money.adapter.payload.JsonCurrencyQuote;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/last")
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AwesomeApi {

    @GET
    @Path("/{money}")
    List<JsonCurrencyQuote> currencyQuoteValues(@PathParam("money") String money);
}
