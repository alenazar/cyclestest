package ru.netology.sqr.javaqamvn2.services;

public class SQRService {

    public int squareRootsCounter(int rangeLimitMin, int rangeLimitMax) {
        int result = 0;
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            result = i * i;
            if (result >= rangeLimitMin && result <= rangeLimitMax) {
                quantity++;
            }
        }
        return quantity;
    }
}
