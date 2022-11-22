package ru.sber.swaggergenerator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.Date;

@RequiredArgsConstructor
@Data
public class Status {
    private final Date statustime;
    private final String status;
    private final String narrative;
}