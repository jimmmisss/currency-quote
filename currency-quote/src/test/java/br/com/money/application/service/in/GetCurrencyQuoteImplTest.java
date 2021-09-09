package br.com.money.application.service.in;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GetCurrencyQuoteImplTest {

    @Test
    public void givenCurrenciesThenReturnJson() {
        given()
                .when().get("/json/last/currencies/")
                .then()
                .statusCode(200)
                .body("size()", is(1), "[0].code", is("USDBRL"));
    }
}