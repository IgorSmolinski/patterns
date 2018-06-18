package com.patterns.kodillapatterns2.decorator;

import java.math.BigDecimal;

public class KiszonyOgorekDecorator extends  AbstractOrderPizzaDecorator{


        public KiszonyOgorekDecorator(OrderPizza orderPizza) {
            super(orderPizza);
        }

        @Override
        public BigDecimal getCost() {
            return super.getCost().add(new BigDecimal(5));
        }

        @Override
        public String getDescription() {
            return super.getDescription() + "\n+ Kiszony Ogóras";
        }


}
