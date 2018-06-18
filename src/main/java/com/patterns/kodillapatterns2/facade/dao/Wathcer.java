package com.patterns.kodillapatterns2.facade.dao;


import com.patterns.kodillapatterns2.facade.api.OrderDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.stream.Collectors;

@Component("facadeOrderWatcher")
@Aspect
public class Wathcer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Wathcer.class);


    @Before("execution(* com.patterns.kodillapatterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto, userId) && target(object)")
    public void logEvent(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() +
                " OrderDaoItems(args): " + orderDto.getItems().stream()
                .map(item -> item.getProductId().toString())
                .collect(Collectors.joining(";")) +
                " UsersId number(args): " + userId.toString());
    }
}