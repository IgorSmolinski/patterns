package com.patterns.kodillapatterns2.decorator;

import java.math.BigDecimal;

public interface OrderPizza {
    BigDecimal getCost();
    String getDescription();
}