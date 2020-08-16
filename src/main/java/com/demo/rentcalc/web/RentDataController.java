package com.demo.rentcalc.web;

import com.demo.rentcalc.data.RentData;
import com.demo.rentcalc.service.RentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RentDataController {
    @Autowired
    RentDataService rentDataService;

    @PostMapping(value = "/rentdata")

    public RentData saveRentData(@RequestBody RentData rentData)
    {

       return rentDataService.saveRentData(rentData);


    }
    @GetMapping(value = "/rentdata/{id}")
    public Optional<RentData> getRentData(@PathVariable String id){
        return rentDataService.getRentData(id);
    }
    @PutMapping(value = "/rentdata/{id}")
    public void updateRentData(@RequestBody RentData data ,@PathVariable("id") String id){
         rentDataService.updateRentData(id,data);
    }

    }
