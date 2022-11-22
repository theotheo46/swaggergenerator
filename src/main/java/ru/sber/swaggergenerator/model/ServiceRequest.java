package ru.sber.swaggergenerator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Data
public class ServiceRequest {
    private final Date requesttime;
    private final String narrative;
    private final Incident inc;
    private final List<Status> stList;
}