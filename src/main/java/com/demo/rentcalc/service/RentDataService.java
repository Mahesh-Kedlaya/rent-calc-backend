package com.demo.rentcalc.service;

import com.demo.rentcalc.data.RentData;

import java.util.Optional;

public interface RentDataService {


    RentData saveRentData(RentData rentData);
    Optional<RentData> getRentData(String rentData);

    RentData updateRentData(String id, RentData data) ;


}
