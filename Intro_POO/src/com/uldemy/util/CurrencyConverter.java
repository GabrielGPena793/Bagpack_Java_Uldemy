package com.uldemy.util;

public class CurrencyConverter {

    private static final double IOF = 1.06;

    public static double converterDolar(double price, double quantity){
            return  (quantity * price)  * IOF;
    }
}
