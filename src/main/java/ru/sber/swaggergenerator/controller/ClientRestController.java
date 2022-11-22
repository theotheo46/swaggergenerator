package ru.sber.swaggergenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.swaggergenerator.model.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ClientRestController {
    @RequestMapping("/CreateNewClient")
    public Client CreateNewClient(@RequestParam String name, @RequestParam String middlename, @RequestParam String surname,@RequestParam String phonenumber,
                                  @RequestParam String email,@RequestParam Integer inn, @RequestParam String firmname) {
        return new Client(name, middlename, surname, phonenumber, email, inn, firmname, new Order(new Date(), "", "", new BigDecimal(0), new ArrayList<>()));
    }

    @RequestMapping("/GetClientList")
    public List<Client> GetClientList() {
        return new ArrayList<Client>();
    }
}