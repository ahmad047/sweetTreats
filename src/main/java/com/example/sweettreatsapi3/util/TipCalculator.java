package com.example.sweettreatsapi3.util;

import java.math.BigDecimal;

public class TipCalculator {

    public static BigDecimal calculate(BigDecimal minimumTip, BigDecimal maximumTip, Integer distance, BigDecimal tipPerMile) {
        BigDecimal tip = tipPerMile.multiply(BigDecimal.valueOf(distance));

        if(tip.compareTo(minimumTip) == -1){
            return minimumTip;
        } else if (tip.compareTo(maximumTip) == 1) {
            return maximumTip;
        } else {
            return tip;
        }
    }
}