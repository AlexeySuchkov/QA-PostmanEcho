package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToObject;

public class PostmanEchoTest {
    @Test
    void shouldPostToPostman() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(100)
                .body("data", equalToObject("some data"))
        ;
    }
}
