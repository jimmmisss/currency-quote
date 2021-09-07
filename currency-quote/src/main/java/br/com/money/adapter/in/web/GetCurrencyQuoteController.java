package br.com.money.adapter.in.web;

import br.com.money.application.domain.CurrencyQuoteValue;
import br.com.money.application.port.in.GetCurrencyQuotePortIn;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/v1/currency")
@Tag(name = "Currency quote")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GetCurrencyQuoteController {

    private final GetCurrencyQuotePortIn getCurrencyQuotePortIn;

    public GetCurrencyQuoteController(GetCurrencyQuotePortIn getCurrencyQuotePortIn) {
        this.getCurrencyQuotePortIn = getCurrencyQuotePortIn;
    }

    @GET
    @Path("/{currencies}")
    public List<CurrencyQuoteValue> getCurrencyQuote(@PathParam("currencies") String currencies) {
        return getCurrencyQuotePortIn.getCurrencyQuotes(currencies);
    }
}
