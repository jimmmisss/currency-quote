package br.com.money.application.service.in;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GetCurrencyQuoteImplTest {

    @Test
    public void givenCurrenciesThenReturnJson() {
        String currency = "USD-BRL";
        String money = "USD";
        BigDecimal valueProduct = BigDecimal.valueOf(90);
        String valueProductInCurrency = "474.264";
        String prettify = given()
                .when()
                .get("/v1/currency/{currency}/value/{valueProduct}", currency, valueProduct)
                .then()
                .statusCode(200)
                .body("$.size()", is(1),
                        "[0].code", is(money))
                .extract().response().jsonPath().prettify();
        System.out.println(prettify);
    }
}