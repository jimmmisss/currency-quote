package br.com.money.infra.payload;

import java.math.BigDecimal;

public class JsonCurrencyQuoteValue {

    private String code;
    private BigDecimal valueProductInCurrency;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getValueProductInCurrency() {
        return valueProductInCurrency;
    }

    public void setValueProductInCurrency(BigDecimal valueProductInCurrency) {
        this.valueProductInCurrency = valueProductInCurrency;
    }
}