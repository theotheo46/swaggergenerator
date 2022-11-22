package ru.sber.swaggergenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.swaggergenerator.model.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceRequestRestController {

    @RequestMapping("/GetSRListByUser")
    public List<ServiceRequest> GetSRListByUser(@RequestParam String userID) {
        return new ArrayList<ServiceRequest>();
    }

    @RequestMapping("/SetSRStatus")
    public void SetSRStatus(@RequestParam String srID, @RequestParam String status) {
        return;
    }
}