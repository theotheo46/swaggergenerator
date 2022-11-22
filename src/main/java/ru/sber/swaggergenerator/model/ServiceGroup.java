package ru.sber.swaggergenerator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Data
public class ServiceGroup {
    private final String code;
    private final String description;
    private final String groupemail;
    private final Integer managerid;
}