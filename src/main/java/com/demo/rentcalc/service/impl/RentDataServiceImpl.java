package com.demo.rentcalc.service.impl;

import com.demo.rentcalc.data.RentData;
import com.demo.rentcalc.data.repository.RentDataRepository;
import com.demo.rentcalc.service.RentDataService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentDataServiceImpl implements RentDataService {

    private final RentDataRepository rentDataRepository;

    public RentDataServiceImpl(RentDataRepository rentDataRepository) {
        this.rentDataRepository = rentDataRepository;
    }

    @Override
    public RentData saveRentData(RentData rentData) {
        try {
            if (rentData.getId() == null) throw new Exception();

            rentData.setId("ROOMRENT::" + rentData.getMonth().toUpperCase() + "::" + rentData.getYear().toUpperCase());
            return rentDataRepository.save(rentData);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }



    @Override
    public Optional<RentData> getRentData(String id) {
        return rentDataRepository.findById(id);
    }
    @Override
    public RentData updateRentData(String id, RentData data){

         Optional<RentData> oldData = rentDataRepository.findById(id);
         if(oldData.isPresent())
         {
             data.setId(id);
            return rentDataRepository.save(data);
         }
         return data;

    }


}
