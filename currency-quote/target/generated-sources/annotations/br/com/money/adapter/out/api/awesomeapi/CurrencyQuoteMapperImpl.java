package br.com.money.adapter.out.api.awesomeapi;

import br.com.money.adapter.payload.JsonCurrencyQuote;
import br.com.money.application.domain.CurrencyQuote;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T13:43:03-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@ApplicationScoped
public class CurrencyQuoteMapperImpl implements CurrencyQuoteMapper {

    @Override
    public CurrencyQuote map(JsonCurrencyQuote jsonCurrencyQuote) {
        if ( jsonCurrencyQuote == null ) {
            return null;
        }

        CurrencyQuote currencyQuote = new CurrencyQuote();

        return currencyQuote;
    }
}
