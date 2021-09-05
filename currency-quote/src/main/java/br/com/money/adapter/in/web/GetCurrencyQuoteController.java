package br.com.money.adapter.in.web;

import br.com.money.adapter.payload.JsonCurrencyQuote;
import br.com.money.application.port.in.GetCurrencyQuotePortIn;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/v1/currency")
@Tag(name = "Currency quote")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor
public class GetCurrencyQuoteController {

    private final GetCurrencyQuotePortIn getCurrencyQuotePortIn;

    @GET
    @Path("/{currencies}/value/{productValue}")
    public List<JsonCurrencyQuote> getCurrencyQuote(@PathParam("currencies") String currencies,
                                                    @PathParam("productValue") String productValue) {
        var currencyQuotes = getCurrencyQuotePortIn.getCurrencyQuotes(currencies, productValue);
        return null;
    }
}
