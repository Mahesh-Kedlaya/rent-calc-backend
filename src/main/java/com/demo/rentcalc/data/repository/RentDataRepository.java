package com.demo.rentcalc.data.repository;

import com.demo.rentcalc.data.RentData;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentDataRepository extends CouchbaseRepository<RentData, String> {

}
