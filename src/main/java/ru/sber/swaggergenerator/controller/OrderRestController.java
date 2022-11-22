package ru.sber.swaggergenerator.controller;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.swaggergenerator.model.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class OrderRestController {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);

    @SneakyThrows
    @RequestMapping("/CreateNewOrder")
    public Order CreateNewOrder(@RequestParam String date, @RequestParam String code, @RequestParam String narrative, @RequestParam String cost) {
        return new Order(formatter.parse(date), code, narrative, new BigDecimal(cost), new ArrayList<>());
    }

    @RequestMapping("/GetOrderList")
    public List<Order> GetOrderList() {
        return new ArrayList<Order>();
    }
}