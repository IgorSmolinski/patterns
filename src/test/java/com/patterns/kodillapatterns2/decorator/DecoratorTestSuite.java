package com.patterns.kodillapatterns2.decorator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;


public class DecoratorTestSuite {

    @Test
    public void testPizzaGetDescription() {
        //Given
        OrderPizza theOrder = new Pizza();
        theOrder = new KiszonyOgorekDecorator(theOrder);
        theOrder = new ChorizoDecorator(theOrder);
        theOrder = new KupaDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertThat("Pizza ingredients: \n +Dough\n + Tomato\n Sauce\n + Cheese\n\n+ Kiszony Ogóras\n+ Chorizo\n+ Kupa").isEqualTo(description);
    }

    @Test
    public void testPizzaGetCost() {
        //Given
        OrderPizza theOrder = new Pizza();
        theOrder = new KiszonyOgorekDecorator(theOrder);
        theOrder = new ChorizoDecorator(theOrder);
        theOrder = new KupaDecorator(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertThat(new BigDecimal(30)).isEqualTo(cost);
    }
}