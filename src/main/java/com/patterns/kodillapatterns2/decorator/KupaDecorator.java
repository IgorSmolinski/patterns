package com.patterns.kodillapatterns2.decorator;

import java.math.BigDecimal;

public class KupaDecorator extends  AbstractOrderPizzaDecorator{


    public KupaDecorator(OrderPizza orderPizza) {
        super(orderPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n+ Kupa";
    }


}

