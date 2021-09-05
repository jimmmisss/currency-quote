package br.com.money.application.domain;

public class CurrencyQuote {

    private CurrencyQuoteValue currencyQuoteValue;

    public CurrencyQuote() {
    }

    public CurrencyQuote(CurrencyQuoteValue currencyQuoteValue) {
        this.currencyQuoteValue = currencyQuoteValue;
    }

    public CurrencyQuoteValue getCurrencyQuoteValue() {
        return currencyQuoteValue;
    }

    public void setCurrencyQuoteValue(CurrencyQuoteValue currencyQuoteValue) {
        this.currencyQuoteValue = currencyQuoteValue;
    }
}

