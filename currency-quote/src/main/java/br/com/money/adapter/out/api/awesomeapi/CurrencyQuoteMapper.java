package br.com.money.adapter.out.api.awesomeapi;

import br.com.money.adapter.payload.JsonCurrencyQuote;
import br.com.money.application.domain.CurrencyQuote;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface CurrencyQuoteMapper {

    CurrencyQuote map(JsonCurrencyQuote jsonCurrencyQuote);
}
