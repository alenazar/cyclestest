package ru.netology.sqr.javaqamvn2.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/rangeLimits.csv")

    public void test() {
        SQRService service = new SQRService();
        int numberOfSquares = service.squareRootsCounter(300, 500);

        Assertions.assertEquals(5, numberOfSquares);
    }
}
