package com.example.sweettreatsapi3.util;

import java.math.BigDecimal;

public class TipCalculator {
    private static final BigDecimal MINIMUM_TIP = BigDecimal.valueOf(1);
    private static final BigDecimal MAXIMUM_TIP = BigDecimal.valueOf(3);
    private static final BigDecimal TIP_Per_MILE = BigDecimal.valueOf(.75);

    public static BigDecimal calculate(Integer distance) {
        BigDecimal tip = TIP_Per_MILE.multiply(BigDecimal.valueOf(distance));

        if(tip.compareTo(MINIMUM_TIP) == -1){
            return MINIMUM_TIP;
        } else if (tip.compareTo(MAXIMUM_TIP) == 1) {
            return MAXIMUM_TIP;
        } else {
            return tip;
        }
    }
}