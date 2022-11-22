package ru.sber.swaggergenerator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Client {
    private final String name;
    private final String middlename;
    private final String surname;
    private final String phonenumber;
    private final String email;
    private final Integer inn;
    private final String firmname;
    private final Order order;
}