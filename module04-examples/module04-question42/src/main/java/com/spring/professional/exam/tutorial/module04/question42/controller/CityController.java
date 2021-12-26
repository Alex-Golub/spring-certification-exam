package com.spring.professional.exam.tutorial.module04.question42.controller;

import com.spring.professional.exam.tutorial.module04.question42.dao.CityDao;
import com.spring.professional.exam.tutorial.module04.question42.ds.Cities;
import com.spring.professional.exam.tutorial.module04.question42.entity.City;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CityController {
    private CityDao cityDao;

    @GetMapping("/cities")
    public Cities getCities() {
        return new Cities(cityDao.findAll());
    }

    @PutMapping("/cities")
    public void putCity(@RequestBody City city) {
        cityDao.save(city);
    }
}
