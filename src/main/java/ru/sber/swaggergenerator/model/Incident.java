package ru.sber.swaggergenerator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Data
public class Incident {
    private final Date incidenttime;
    private final String businessprocess;
    private final Integer userid;
    private final Service service;
    private final List<Status> stList;
}