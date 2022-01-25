package com.examples.Springproject.Controller;

import com.examples.Springproject.model.City;
import com.examples.Springproject.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {

    @Autowired
    private ICityService cityService;

    @GetMapping("/cities")
    public String findCities(Model model) {

        var cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }
}
