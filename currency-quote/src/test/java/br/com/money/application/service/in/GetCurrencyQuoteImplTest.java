package br.com.money.application.service.in;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;
import java.math.BigDecimal;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
class GetCurrencyQuoteImplTest {

    @Test
    public void givenCurrenciesThenReturnJson() {
        String currency = "USD-BRL";
        String money = "USD";
        BigDecimal valueProduct = BigDecimal.valueOf(90);
        Double valueProductInCurrency = 474.264;
        String prettify = given()
                .when()
                .get("/v1/currency/{currency}/value/{valueProduct}", currency, valueProduct)
                .then()
                .body("size()", equalTo(1))
                .body("code", hasItem(money))
                .statusCode(Response.Status.OK.getStatusCode())
                .extract().response().jsonPath().prettify();
        System.out.println(prettify);
    }
}