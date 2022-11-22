package ru.sber.swaggergenerator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Data
public class Order {
    private final Date orderdate;
    private final String code;
    private final String narrative;
    private final BigDecimal cost;
    private final List<ServiceRequest> srList;
}