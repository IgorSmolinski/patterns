package com.patterns.kodillapatterns2.decorator;

import java.math.BigDecimal;

public class AbstractOrderPizzaDecorator implements OrderPizza{


        private final OrderPizza orderPizza;

        protected AbstractOrderPizzaDecorator(OrderPizza orderPizza) {
            this.orderPizza = orderPizza;
        }

        @Override
        public BigDecimal getCost() {
            return orderPizza.getCost();
        }

        @Override
        public String getDescription() {
            return orderPizza.getDescription();
        }
}

