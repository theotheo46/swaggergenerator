package ru.sber.swaggergenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.swaggergenerator.model.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IncidentRestController {

    @RequestMapping("/GetIncListByUser")
    public List<Incident> GetIncListByUser(@RequestParam String userID) {
        return new ArrayList<Incident>();
    }

    @RequestMapping("/SetIncStatus")
    public void SetIncStatus(@RequestParam String incID, @RequestParam String status) {
        return;
    }
}