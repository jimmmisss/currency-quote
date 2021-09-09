package br.com.money.adapter.in.web;

import br.com.money.application.port.in.GetCurrencyQuotePortIn;
import br.com.money.infra.payload.JsonCurrencyQuoteValue;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

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
    @Path("/{currencies}/value/{valueProduct}")
    public List<JsonCurrencyQuoteValue> getCurrencyQuote(@PathParam("currencies") String currencies,
                                                         @PathParam("valueProduct") BigDecimal valueProduct) {
        var currencyQuotes = getCurrencyQuotePortIn.getCurrencyQuotes(currencies, valueProduct);
        return currencyQuotes.stream()
                .map(e -> {
                    var jsonCurrencyQuoteValue = new JsonCurrencyQuoteValue();
                    jsonCurrencyQuoteValue.setCode(e.getCode());
                    jsonCurrencyQuoteValue.setValueProductInCurrency(e.getValueProductInCurrency());
                    return jsonCurrencyQuoteValue;
                }).collect(Collectors.toList());
    }
}
