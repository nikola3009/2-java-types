package com.example.task11;

import java.math.BigDecimal;

public class Task11 {

    public static float benefit(float sum, float percent) {

        float res = (float) (sum *  Math.pow(1.0 + percent, 12));
        sum = res;
        return  sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.printf("Сумма на счете через год: %.5f " , sum);

    }

}
