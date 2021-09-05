package br.com.money.adapter.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonCurrencyQuote {

    private JsonCurrencyQuoteValue jsonCurrencyQuoteValue;
}