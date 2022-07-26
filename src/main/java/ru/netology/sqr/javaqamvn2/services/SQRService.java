package ru.netology.sqr.javaqamvn2.services;

public class SQRService {

    public int SquareRootsCounter(int rangeLimitMin, int rangeLimitMax) {
        int result = 0;
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            result = i * i;
            if (result >= 300 && result <= 500) {
                quantity++;
            }
        }
        return quantity;
    }
}
