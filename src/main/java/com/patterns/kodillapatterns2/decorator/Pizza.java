package com.patterns.kodillapatterns2.decorator;

import java.math.BigDecimal;

public class Pizza implements OrderPizza {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza ingredients: \n +Dough\n + Tomato\n Sauce\n + Cheese\n";
    }

}
