package ru.sber.swaggergenerator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Data
public class Service {
    private final String code;
    private final String description;
    private final ServiceGroup sg;
}